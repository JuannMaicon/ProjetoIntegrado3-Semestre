package fornecedor;

public class ValidacaoUtil {

	// Valida CPF
	public static boolean validarCPF(String cpf) {
		if (cpf == null || cpf.length() != 11 || !cpf.matches("\\d+")) {
			return false;
		}

		int soma = 0;
		int resto;

		for (int i = 0; i < 9; i++) {
			soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (10 - i);
		}

		resto = soma % 11;
		if (resto < 2) {
			if (Integer.parseInt(String.valueOf(cpf.charAt(9))) != 0) {
				return false;
			}
		} else {
			if (Integer.parseInt(String.valueOf(cpf.charAt(9))) != 11 - resto) {
				return false;
			}
		}

		soma = 0;
		for (int i = 0; i < 10; i++) {
			soma += Integer.parseInt(String.valueOf(cpf.charAt(i))) * (11 - i);
		}

		resto = soma % 11;
		if (resto < 2) {
			if (Integer.parseInt(String.valueOf(cpf.charAt(10))) != 0) {
				return false;
			}
		} else {
			if (Integer.parseInt(String.valueOf(cpf.charAt(10))) != 11 - resto) {
				return false;
			}
		}

		return true;
	}

	// Valida CNPJ

	public static boolean validarCNPJ(String cnpj) {
		if (cnpj == null || cnpj.length() != 14 || !cnpj.matches("\\d+")) {
			return false;
		}

		String cnpjBase = cnpj.substring(0, 12);
		int soma = 0;
		int resto;

		for (int i = 0; i < 12; i++) {
			soma += Integer.parseInt(String.valueOf(cnpj.charAt(i))) * (5 - (i % 8));
		}

		resto = soma % 11;
		if (resto < 2) {
			if (Integer.parseInt(String.valueOf(cnpj.charAt(12))) != 0) {
				return false;
			}
		} else {
			if (Integer.parseInt(String.valueOf(cnpj.charAt(12))) != 11 - resto) {
				return false;
			}
		}

		soma = 0;
		for (int i = 0; i < 13; i++) {
			soma += Integer.parseInt(String.valueOf(cnpj.charAt(i))) * (6 - (i % 8));
		}

		resto = soma % 11;
		if (resto < 2) {
			if (Integer.parseInt(String.valueOf(cnpj.charAt(13))) != 0) {
				return false;
			}
		} else {
			if (Integer.parseInt(String.valueOf(cnpj.charAt(13))) != 11 - resto) {
				return false;
			}
		}

		return true;
	}
}

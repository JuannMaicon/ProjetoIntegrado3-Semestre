package ado4ex;
import java.util.InputMismatchException;
public class Utilitaria {
    // Validação de CNPJ
	   public static boolean validarCNPJ(String cnpj) {
	        if (cnpj == null || cnpj.length() != 14) {
	            return false;
	        }

	        char dig13, dig14;
	        int sm, i, r, num, peso;

	        try {
	            // Cálculo do primeiro dígito verificador
	            sm = 0;
	            peso = 2;
	            for (i = 11; i >= 0; i--) {
	                num = (int) (cnpj.charAt(i) - 48);
	                sm += (num * peso);
	                peso++;
	                if (peso == 10) peso = 2;
	            }

	            r = sm % 11;
	            if (r == 0 || r == 1) {
	                dig13 = '0';
	            } else {
	                dig13 = (char) ((11 - r) + 48);
	            }

	            // Cálculo do segundo dígito verificador
	            sm = 0;
	            peso = 2;
	            for (i = 12; i >= 0; i--) {
	                num = (int) (cnpj.charAt(i) - 48);
	                sm += (num * peso);
	                peso++;
	                if (peso == 10) peso = 2;
	            }

	            r = sm % 11;
	            if (r == 0 || r == 1) {
	                dig14 = '0';
	            } else {
	                dig14 = (char) ((11 - r) + 48);
	            }

	            return dig13 == cnpj.charAt(12) && dig14 == cnpj.charAt(13);
	        } catch (InputMismatchException erro) {
	            return false;
	        }
	    }

	    // Validação de CPF
	    public static boolean validarCPF(String cpf) {
	        if (cpf == null || cpf.length() != 11) {
	            return false;
	        }

	        char dig10, dig11;
	        int sm, i, r, num, peso;

	        try {
	            // Cálculo do primeiro dígito verificador
	            sm = 0;
	            peso = 10;
	            for (i = 0; i < 9; i++) {
	                num = (int) (cpf.charAt(i) - 48);
	                sm += (num * peso);
	                peso--;
	            }

	            r = 11 - (sm % 11);
	            if (r == 10 || r == 11) {
	                dig10 = '0';
	            } else {
	                dig10 = (char) (r + 48);
	            }

	            // Cálculo do segundo dígito verificador
	            sm = 0;
	            peso = 11;
	            for (i = 0; i < 10; i++) {
	                num = (int) (cpf.charAt(i) - 48);
	                sm += (num * peso);
	                peso--;
	            }

	            r = 11 - (sm % 11);
	            if (r == 10 || r == 11) {
	                dig11 = '0';
	            } else {
	                dig11 = (char) (r + 48);
	            }

	            return dig10 == cpf.charAt(9) && dig11 == cpf.charAt(10);
	        } catch (InputMismatchException erro) {
	            return false;
	        }
	    }

	    // Validação de Inscrição Estadual (IE) de São Paulo
	    public static boolean validarIESaoPaulo(String ie) {
	        if (ie == null || ie.length() != 12) {
	            return false;
	        }

	        int sum = 0;
	        int weight = 1;

	        for (int i = 0; i < 8; i++) {
	            int num = Integer.parseInt(ie.substring(i, i + 1));
	            sum += num * weight;
	            weight++;
	            if (weight == 2) weight = 3;
	        }

	        sum %= 11;
	        int digit = sum <= 9 ? sum : 0;
	        return Integer.parseInt(ie.substring(8, 9)) == digit;
	    }

	    // Validação de RG de São Paulo (formato geral)
	    public static boolean validarRGSaoPaulo(String rg) {
	        return rg != null && rg.matches("\\d{2}\\.\\d{3}\\.\\d{3}-\\d");
	    }}

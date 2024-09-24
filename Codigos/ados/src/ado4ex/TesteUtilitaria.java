package ado4ex;

import javax.swing.JOptionPane;

public class TesteUtilitaria {

	public static void main(String[] args) {
		String[] opcoes = { "Validar CPF", "Validar CNPJ", "Validar Inscrição Estadual", "Validar RG" };
		int escolha = JOptionPane.showOptionDialog(null, "Escolha o que deseja validar:", "Validador",
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, opcoes, opcoes[0]);
		String entrada;
		boolean resultado = false;
		switch (escolha) {
		case 0:
			entrada = JOptionPane.showInputDialog("Digite o CPF (11 dígitos):");
			resultado = Utilitaria.validarCPF(entrada);
			JOptionPane.showMessageDialog(null, resultado ? "CPF válido!" : "CPF inválido.");
			break;
		case 1:
			entrada = JOptionPane.showInputDialog("Digite o CNPJ (14 dígitos):");
			resultado = Utilitaria.validarCNPJ(entrada);
			JOptionPane.showMessageDialog(null, resultado ? "CNPJ válido!" : "CNPJ inválido.");
			break;
		case 2:
			entrada = JOptionPane.showInputDialog("Digite a Inscrição Estadual de SP (12 dígitos):");
			resultado = Utilitaria.validarIESaoPaulo(entrada);
			JOptionPane.showMessageDialog(null,
					resultado ? "Inscrição Estadual válida!" : "Inscrição Estadual inválida.");
			break;
		case 3:
			entrada = JOptionPane.showInputDialog("Digite o RG de SP (no formato XX.XXX.XXX-X):");
			resultado = Utilitaria.validarRGSaoPaulo(entrada);
			JOptionPane.showMessageDialog(null, resultado ? "RG válido!" : "RG inválido.");
			break;
		}
	}

}

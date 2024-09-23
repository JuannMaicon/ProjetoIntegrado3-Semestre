package fornecedor;

import javax.swing.JOptionPane;

public class CadastraFornecedor {

	public static void main(String[] args) {
		int resp;

		do {
			String[] valores = { "Pessoa", "Empresa" };
			Object escolha = JOptionPane.showInputDialog(null, "Qual Fornecedor deseja Cadastrar?",
					"Cadastro de Fornecedor", JOptionPane.QUESTION_MESSAGE, null, valores, valores[0]);

			// Verifica se o usuário clicou em Cancelar ou fechou a caixa de diálogo
			if (escolha == null) {
				JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
				break; // Encerra o loop e o programa
			}

			Fornecedor f = null;

			if (escolha.equals("Pessoa")) {
				String nome = JOptionPane.showInputDialog("Digite o Nome da Pessoa");
				String cpf = JOptionPane.showInputDialog("Digite o CPF");

				// Verifica se o usuário clicou em Cancelar ou fechou a caixa de diálogo
				if (nome == null || cpf == null) {
					JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
					break; // Encerra o loop e o programa
				}

				while (!ValidacaoUtil.validarCPF(cpf)) {
					JOptionPane.showMessageDialog(null, "CPF inválido. Digite novamente.");
					cpf = JOptionPane.showInputDialog("Digite o CPF");
					if (cpf == null) {
						JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
						break; // Encerra o loop e o programa
					}
				}

				String rg = JOptionPane.showInputDialog("Digite o RG");
				String telefone = JOptionPane.showInputDialog("Digite o Telefone");

				// Verifica se o usuário clicou em Cancelar ou fechou a caixa de diálogo
				if (rg == null || telefone == null) {
					JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
					break; // Encerra o loop e o programa
				}

				f = new FornecedorPessoa(nome, telefone, cpf, rg);
			} else if (escolha.equals("Empresa")) {
				String nome = JOptionPane.showInputDialog("Digite o Nome da Empresa");
				String cnpj = JOptionPane.showInputDialog("Digite o CNPJ");

				// Verifica se o usuário clicou em Cancelar ou fechou a caixa de diálogo
				if (nome == null || cnpj == null) {
					JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
					break; // Encerra o loop e o programa
				}

				while (!ValidacaoUtil.validarCNPJ(cnpj)) {
					JOptionPane.showMessageDialog(null, "CNPJ inválido. Digite novamente.");
					cnpj = JOptionPane.showInputDialog("Digite o CNPJ");
					if (cnpj == null) {
						JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
						break; // Encerra o loop e o programa
					}
				}

				String ie = JOptionPane.showInputDialog("Digite a IE");
				String telefone = JOptionPane.showInputDialog("Digite o Telefone");

				// Verifica se o usuário clicou em Cancelar ou fechou a caixa de diálogo
				if (ie == null || telefone == null) {
					JOptionPane.showMessageDialog(null, "Cadastro cancelado.");
					break; // Encerra o loop e o programa
				}

				f = new FornecedorEmpresa(nome, telefone, cnpj, ie);
			}

			if (f != null) {
				System.out.println(f);
			} else {
				System.out.println("Fornecedor não cadastrado.");
			}

			resp = JOptionPane.showConfirmDialog(null, "Deseja cadastrar outro fornecedor?", "Continuação",
					JOptionPane.YES_NO_OPTION);

			// Encerra o loop se o usuário clicar em "Não"
			if (resp == JOptionPane.NO_OPTION) {
				break;
			}
		} while (resp == JOptionPane.YES_OPTION);

		JOptionPane.showMessageDialog(null, "Cadastro encerrado.");
	}
}
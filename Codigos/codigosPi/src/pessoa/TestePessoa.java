package pessoa;

import javax.swing.JOptionPane;

public class TestePessoa {

	public static void main(String[] args) {
		Pessoa joao = new Pessoa();
		joao.setSexo(Pessoa.MASCULINO);
		joao.setNome(JOptionPane.showInputDialog("Digite o telefone: "));
		joao.setTelefone(JOptionPane.showInputDialog("digite o telefone: "));
		joao.imprimir();

	}

}

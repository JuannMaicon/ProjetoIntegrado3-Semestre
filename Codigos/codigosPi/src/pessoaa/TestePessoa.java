package pessoaa;

import javax.swing.JOptionPane;



public class TestePessoa {

	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa();
		pessoa1.setNome("Matheus");
		pessoa1.setIdade("25");
		pessoa1.setSexo(Pessoa.MASCULINO);
		pessoa1.imprimir();

	}

}

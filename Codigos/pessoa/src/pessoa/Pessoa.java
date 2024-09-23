package pessoa;

import javax.swing.JOptionPane;

public class Pessoa {
	private String nome;
	private String telefone;
	private String sexo;
	public static final int MASCULINO = 1;
	public static final int FEMININO = 2;

	// METODOS
	public void setSexo(int s) {
		if (s == 1)

			sexo = "MASCULINO";
		else
			sexo = "FEMININO";
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getSexo() {
		return sexo;
	}

	public void imprimir() {
		System.out.println("Nome: " + getNome() + "\tTelefone: " + getTelefone() + "\tSexo: " + getSexo());
		;
	}

}

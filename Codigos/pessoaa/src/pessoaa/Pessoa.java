package pessoaa;

public class Pessoa {
	public String nome;
	public String idade;
	public String altura;
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

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getAltura() {
		return altura;
	}

	public void setAltura(String altura) {
		this.altura = altura;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public void imprimir() {
		System.out.println("Nome: " + getNome() + "\tIdade: " + getIdade() + "\tAltura: " + getAltura() + "\tSexo: "+ getSexo());
		;
	}
}


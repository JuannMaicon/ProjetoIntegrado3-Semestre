package Fornecedor;

public class Fornecedor {
	private String nome, fone;

	// Métodos//
	public Fornecedor() {

	}

	public void Fornecedor(String nome, String fone) {
		this.nome = "nome";
		this.fone = "fone";

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	@Override
	public String toString() {
		return "Fornecedor [nome= " + nome + ", fone= " + fone + "]";
	}

}

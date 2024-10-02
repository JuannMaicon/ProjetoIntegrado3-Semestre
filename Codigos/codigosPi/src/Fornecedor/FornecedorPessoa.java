package Fornecedor;

public class FornecedorPessoa extends Fornecedor {
	private String rg;
	private String cpf;

	// Métodos
	

	public  FornecedorPessoa(String nome, String fone, String Rg, String cpf) {
		this.Fornecedor(nome,fone);
		this.rg = "rg";
		this.cpf = "cpf";
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public String toString() {
		return "FornecedorPessoa [ Nome = " + super.getNome() +  " Fone = " + getFone()
		+ "CPF= " + cpf + ", rg= " + rg + ", "
				+ "]";
	}
}

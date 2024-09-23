package fornecedor;

public class FornecedorEmpresa extends Fornecedor {
	private String IE;
	private String CNPJ;

	// Métodos

	public FornecedorEmpresa(String nome, String fone, String IE, String CNPJ) {
		this.Fornecedor(nome,fone);
		this.IE = "IE";
		this.CNPJ = "CNPJ";

	}

	public String getIE() {
		return IE;
	}

	public void setIE(String iE) {
		IE = iE;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	@Override
	public String toString() {
		return "FornecedorEmpresa [ "
				+ " Nome= " + super.getNome() 
				+ ", Fone= " + super.getFone() 
				+ "IE= " + IE + ", CNPJ= " + CNPJ+ "]";
	}

}

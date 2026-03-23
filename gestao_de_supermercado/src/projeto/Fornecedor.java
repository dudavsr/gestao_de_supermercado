package projeto;

public class Fornecedor {
	// Atributos privados
	private String nomeEmpresa;
	private String nif;
	private String paisOrigem;
	
	// Construtor
	public Fornecedor(String nomeEmpresa, String nif, String paisOrigem) {
		this.nomeEmpresa = nomeEmpresa;
		this.nif = nif;
		this.paisOrigem = paisOrigem;
	}
	
	// Métodos Getters e Setters
	public String getNomeEmpresa() {
		return nomeEmpresa;
	}
	
	public String getNif() {
		return nif;
	}
	
	public String getPaisOrigem() {
		return paisOrigem;
	}
	
	public void setNomeEmpresa(String nomeEmpresa) {
		this.nomeEmpresa = nomeEmpresa;
	}
	
	public void setNif(String nif) {
		this.nif = nif;
	}
	
	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	//Método que imprime as informações
	public void exibirDetalhesFornecedor() {
		System.out.println("Nome da empresa: " + this.nomeEmpresa);
		System.out.println("Número de Identificação Fiscal: " + this.nif);
		System.out.println("País de origem: " + this.paisOrigem);
	}
}

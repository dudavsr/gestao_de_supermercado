package projeto;

public abstract class Produto {
	// Atributos 
	private String nome;
	private int codigoBarras;
	private double precoBase;
	private Fornecedor fornecedor;
	
	// Construtor
	public Produto(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor) {
		this.nome = nome;
		this.codigoBarras = codigoBarras;
		this.precoBase = precoBase;
		this.fornecedor = fornecedor;
	}
	
	// Métodos Getters e Setters
	public String getNome() {
		return nome;
	}
	
	public int getCodigoBarras() {
		return codigoBarras;
	}
	
	public double getPrecoBase() {
		return precoBase;
	}
	
	public Fornecedor getFornecedor() {
		return fornecedor;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCodigoBarras(int codigoBarras) {
		this.codigoBarras = codigoBarras;
	}
	
	public void setPrecoBase(double precoBase) {
		this.precoBase = precoBase;
	}
	
	public void setFornecedor(Fornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}
	
	// Método abstrato 
	public abstract double calcularPrecoFinal();
	
	// Método concreto
	public void exibirResumo() {
		System.out.println("Nome do produto: " + nome);
		System.out.println("Preço base: " + precoBase);
	}
}

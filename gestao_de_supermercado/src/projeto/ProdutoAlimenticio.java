package projeto;

public class ProdutoAlimenticio extends Produto{
	// Atributo
	private int diasValidade;
	
	// Construtor
	public ProdutoAlimenticio(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int diasValidade) {
		super(nome, codigoBarras, precoBase, fornecedor);
		this.diasValidade = diasValidade;
	}
	
	// Métodos Get e Set
	public int getDiasValidade() {
		return diasValidade;
	}
	
	public void setDiasValidade(int diasValidade) {
		this.diasValidade = diasValidade;
	}
	
	// Método com override
	@Override
	public double calcularPrecoFinal() {
		double precoFinal;
		double precoBase = getPrecoBase();
		int diasValidade = getDiasValidade();
		
		precoFinal = precoBase * 1.20;
		
		if (diasValidade <= 5) {
			precoFinal = precoFinal * 0.7;
			return precoFinal;
		} 
		
		return precoFinal;
	}
}

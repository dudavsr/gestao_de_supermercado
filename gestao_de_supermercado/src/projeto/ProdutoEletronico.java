package projeto;

public class ProdutoEletronico extends Produto{
	// Atributo
	private int mesesGarantia;
	
	// Construtor
	public ProdutoEletronico(String nome, int codigoBarras, double precoBase, Fornecedor fornecedor, int mesesGarantia) {
		super(nome, codigoBarras, precoBase, fornecedor);
		this.mesesGarantia = mesesGarantia;
	}
	
	// Métodos Get e Set
	public int getMesesGarantia() {
		return mesesGarantia;
	}
	
	public void setMesesGarantia(int mesesGarantia) {
		this.mesesGarantia = mesesGarantia;
	}
	
	// Método com override
	@Override
	public double calcularPrecoFinal() {
		double precoFinal;
		double precoBase = getPrecoBase();
		int mesesGarantia = getMesesGarantia();
		
		precoFinal = precoBase * 1.50;
		
		if (mesesGarantia > 12) {
			precoFinal = precoFinal * 1.15;
			return precoFinal;
		}
		
		return precoFinal;
	}
}

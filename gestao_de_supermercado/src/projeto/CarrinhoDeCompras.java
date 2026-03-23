package projeto;
import java.util.ArrayList;

public class CarrinhoDeCompras {
	// ArrayList
	private ArrayList<Produto> produtos;
	
	// Construtor
	public CarrinhoDeCompras() {
		produtos = new ArrayList<>();
	}
	
	// Método adicionarItem
	public void adicionarItem(Produto produto) {
		produtos.add(produto);
	}
	
	// Método processarCompra
	public double processarCompra() {
		double total = 0;
		
		for(Produto produto : produtos) {
			double preco = produto.calcularPrecoFinal();
			total += preco;
		}
		
		return total;
	}
}

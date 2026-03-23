package projeto;

public class Main {

	public static void main(String[] args) {
		// Instanciar dois fornecedores
		Fornecedor tech = new Fornecedor("Samsung", "123", "USA");
		Fornecedor farm = new Fornecedor("Fazenda Santa Terezinha", "456", "BRA");
		
		// Instanciar dois produtos, um eletronico e um alimenticio
		ProdutoAlimenticio leite = new ProdutoAlimenticio("Leite", 789, 5.39, farm, 10);
		ProdutoEletronico celular = new ProdutoEletronico("Celular", 345, 999.99, tech, 12);
		
		// Instanciar carrinho de compras
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adicionarItem(celular);
		carrinho.adicionarItem(leite);
		
		// Método e imprimir o total
		double total = carrinho.processarCompra();
		System.out.printf("Total: %.2f", total);
	}
}

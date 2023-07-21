package lazy;

public class Main {
    public static void main(String[] args) {
//              IProdutoDAO produtoDAO = new ProdutoDAO();
        IProdutoDAO produtoDAO = new LazyProdutoDAO();
        ProdutoService produtoService = new ProdutoService(produtoDAO);
        System.out.println("Produto service criado.");
        produtoService.buscarProduto(1);
        produtoService.buscarProduto(2);
        produtoService.buscarProduto(3);
    }
}
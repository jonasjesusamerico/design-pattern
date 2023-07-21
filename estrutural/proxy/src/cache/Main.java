package cache;

public class Main {
    public static void main(String[] args) {
        //                ProdutoDAO produtoDAO = new ProdutoDAO();
        ProdutoDAO produtoDAO = new CacheProdutoDAO();
        ProdutoService produtoService = new ProdutoService(produtoDAO);

        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);
        produtoService.buscarProduto(1);
    }
}
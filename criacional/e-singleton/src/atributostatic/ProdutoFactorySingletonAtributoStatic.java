package atributostatic;

import produto.Produto;

public class ProdutoFactorySingletonAtributoStatic {

    public static final ProdutoFactorySingletonAtributoStatic INSTANCE = new ProdutoFactorySingletonAtributoStatic();

    private ProdutoFactorySingletonAtributoStatic() {

    }

    public Produto createProduto(String descricao, double preco) {
        return new Produto(descricao, preco);
    }
}

package blazy;

import produto.Produto;

import java.util.Objects;

public class ProdutoFactorySingletonLazy {

    private static ProdutoFactorySingletonLazy INSTANCE;

    private ProdutoFactorySingletonLazy() {

    }

    public static ProdutoFactorySingletonLazy getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new ProdutoFactorySingletonLazy();
        }
        return INSTANCE;
    }

    public Produto createProduto(String descricao, double preco) {
        return new Produto(descricao, preco);
    }
}

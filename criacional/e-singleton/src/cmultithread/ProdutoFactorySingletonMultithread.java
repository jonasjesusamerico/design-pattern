package cmultithread;

import produto.Produto;

import java.util.Objects;

public class ProdutoFactorySingletonMultithread {

    private static ProdutoFactorySingletonMultithread INSTANCE;

    private ProdutoFactorySingletonMultithread() {

    }

    public synchronized static ProdutoFactorySingletonMultithread getInstance() {
        if (Objects.isNull(INSTANCE)) {
            INSTANCE = new ProdutoFactorySingletonMultithread();
        }
        return INSTANCE;
    }

    public Produto createProduto(String descricao, double preco) {
        return new Produto(descricao, preco);
    }
}

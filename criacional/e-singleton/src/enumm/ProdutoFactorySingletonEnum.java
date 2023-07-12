package enumm;

import produto.Produto;

public enum ProdutoFactorySingletonEnum {

    INSTANCE;

    public Produto createProduto(String descricao, double preco) {
        return new Produto(descricao, preco);
    }
}

package builder;

import produto.Carro;

public interface CarroBuilder {

    void setVelocidade(int velocidade);

    Carro build();

}

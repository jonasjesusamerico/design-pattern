package builder;

import produto.Carro;
import produto.CarroNovo;

public class CarroNovoBuilder implements CarroBuilder {

    private int velocidade;

    @Override
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public Carro build() {
        return new CarroNovo(velocidade);
    }

}

package builder;

import produto.Carro;
import produto.CarroVelho;

public class CarroVelhoBuilder implements CarroBuilder {

    private int velocidade;

    @Override
    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    @Override
    public Carro build() {
        return new CarroVelho(velocidade);
    }

}

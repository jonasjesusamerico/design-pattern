import builder.CarroNovoBuilder;
import builder.CarroVelhoBuilder;
import produto.Carro;
import produto.CarroVelho;

public class Main {
    public static void main(String[] args) {
        Carro carro;

        CarroNovoBuilder carroNovoBuilder = new CarroNovoBuilder();
        carroNovoBuilder.setVelocidade(120);
        carro = carroNovoBuilder.build();
        carro.andar();
        carro.freiar();

        CarroVelhoBuilder carroVelhoBuilder = new CarroVelhoBuilder();
        carro = carroVelhoBuilder.build();
        carro.andar();
        carro.freiar();

    }
}
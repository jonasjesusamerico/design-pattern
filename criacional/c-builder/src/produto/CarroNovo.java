package produto;

public class CarroNovo implements Carro {

    private final int velocidade;

    public CarroNovo(int velocidade) {
        this.velocidade = velocidade;
    }


    @Override
    public void andar() {
        if (velocidade == 0) {
            System.out.println("Não consigo andar");
            return;
        }

        System.out.println("Sou um carro novo e estou andando na velocidade: " + velocidade + " km/h");
    }

    @Override
    public void freiar() {
        if (velocidade == 0) {
            System.out.println("Já estou parado!");
            return;
        }
        System.out.println("Sou um carro novo e estou freiando");
    }
}

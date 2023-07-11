package produto;

public class CarroVelho implements Carro {

    private final int velocidade;

    public CarroVelho(int velocidade) {
        this.velocidade = velocidade;
    }


    @Override
    public void andar() {
        if (velocidade == 0) {
            System.out.println("Não consigo andar");
            return;
        }

        System.out.println("Sou um carro velho e estou andando na velocidade: " + velocidade + " km/h");
    }

    @Override
    public void freiar() {
        if (velocidade == 0) {
            System.out.println("Já estou parado!");
            return;
        }
        System.out.println("Sou um carro velho e estou freiando");
    }
}

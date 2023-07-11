import fabrica.MoveisFactory;
import produto.cadeira.Cadeira;
import produto.mesacentro.MesaCentro;
import produto.sofa.Sofa;

public class Fabrica {

    private final MesaCentro mesaCentro;
    private final Cadeira cadeira;
    private final Sofa sofa;

    public Fabrica(MoveisFactory moveisFactory) {
        this.mesaCentro = moveisFactory.criarMesaCentro();
        this.cadeira = moveisFactory.criarCadeira();
        this.sofa = moveisFactory.criarSofa();
    }

    public static Fabrica produzir(MoveisFactory moveisFactory) {
        return new Fabrica(moveisFactory);
    }

    public void iniciar() {
        this.mesaCentro.print();
        this.cadeira.print();
        this.sofa.print();
    }
}

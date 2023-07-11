package fabrica;

import produto.cadeira.Cadeira;
import produto.cadeira.VitorianoCadeira;
import produto.mesacentro.MesaCentro;
import produto.mesacentro.VitorianoMesaCentro;
import produto.sofa.Sofa;
import produto.sofa.VitorianoSofa;

public class VitorianoMoveisFactory implements MoveisFactory {

    private VitorianoMoveisFactory() {
    }

    public static MoveisFactory create() {
        return new VitorianoMoveisFactory();
    }

    @Override
    public Cadeira criarCadeira() {
        return new VitorianoCadeira();
    }

    @Override
    public Sofa criarSofa() {
        return new VitorianoSofa();
    }

    @Override
    public MesaCentro criarMesaCentro() {
        return new VitorianoMesaCentro();
    }
}

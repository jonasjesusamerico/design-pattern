package fabrica;

import produto.cadeira.ArtDecoCadeira;
import produto.cadeira.Cadeira;
import produto.mesacentro.ArtDecoMesaCentro;
import produto.mesacentro.MesaCentro;
import produto.sofa.ArtDecoSofa;
import produto.sofa.Sofa;

public class ArtDecoMoveisFactory implements MoveisFactory {

    private ArtDecoMoveisFactory() {
    }

    public static MoveisFactory create() {
        return new ArtDecoMoveisFactory();
    }

    @Override
    public Cadeira criarCadeira() {
        return new ArtDecoCadeira();
    }

    @Override
    public Sofa criarSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public MesaCentro criarMesaCentro() {
        return new ArtDecoMesaCentro();
    }
}

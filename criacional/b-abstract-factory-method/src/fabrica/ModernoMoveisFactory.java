package fabrica;

import produto.cadeira.ArtDecoCadeira;
import produto.cadeira.Cadeira;
import produto.cadeira.ModernoCadeira;
import produto.mesacentro.ArtDecoMesaCentro;
import produto.mesacentro.MesaCentro;
import produto.mesacentro.ModernoMesaCentro;
import produto.sofa.ArtDecoSofa;
import produto.sofa.ModernoSofa;
import produto.sofa.Sofa;

public class ModernoMoveisFactory implements MoveisFactory {


    private ModernoMoveisFactory() {
    }

    public static MoveisFactory create() {
        return new ModernoMoveisFactory();
    }

    @Override
    public Cadeira criarCadeira() {
        return new ModernoCadeira();
    }

    @Override
    public Sofa criarSofa() {
        return new ModernoSofa();
    }

    @Override
    public MesaCentro criarMesaCentro() {
        return new ModernoMesaCentro();
    }
}

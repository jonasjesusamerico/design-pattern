package fabrica;

import produto.cadeira.Cadeira;
import produto.mesacentro.MesaCentro;
import produto.sofa.Sofa;

public interface MoveisFactory {

    Cadeira criarCadeira();

    Sofa criarSofa();

    MesaCentro criarMesaCentro();

}

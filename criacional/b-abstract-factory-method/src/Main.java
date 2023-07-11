import fabrica.ArtDecoMoveisFactory;
import fabrica.ModernoMoveisFactory;
import fabrica.VitorianoMoveisFactory;

public class Main {
    public static void main(String[] args) {

        Fabrica.produzir(ArtDecoMoveisFactory.create()).iniciar();

        System.out.println("----");

        Fabrica.produzir(ModernoMoveisFactory.create()).iniciar();

        System.out.println("----");

        Fabrica.produzir(VitorianoMoveisFactory.create()).iniciar();


    }
}
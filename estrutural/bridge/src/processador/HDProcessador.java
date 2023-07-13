package processador;

public class HDProcessador implements VideoProcessador {
    @Override
    public void processar(String videoFile) {
        System.out.println(" estou processando em HD");
    }
}

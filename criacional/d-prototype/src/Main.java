import produto.Documento;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Documento documentoA = new Documento("Teste", "PDF");
        System.out.println("Documento A: " + documentoA);

        Documento documentoClone = Documento.clone(documentoA);
        System.out.println("Documento Clone: " + documentoClone);

        System.out.println("São iguais: " + Objects.equals(documentoA, documentoClone));

        documentoClone.setFormato("DOC");
        System.out.println("--");

        System.out.println(documentoA);
        System.out.println(documentoClone);

//        Documento A: Documento{nome='Teste', formato='PDF'}
//        Documento Clone: Documento{nome='Teste', formato='PDF'}
//        --
//        Documento{nome='Teste', formato='PDF'}
//        Documento{nome='Teste', formato='DOC'}
//        São iguais: false


    }
}
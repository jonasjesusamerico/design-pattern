package produto;

import java.util.Objects;

public class Documento {

    private String nome;
    private String formato;

    public Documento(String nome, String formato) {
        this.nome = nome;
        this.formato = formato;
    }

    public static Documento clone(Documento documento) {
        return new Documento(documento.getNome(), documento.getFormato());
    }


    public String getNome() {
        return nome;
    }

    public String getFormato() {
        return formato;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "nome='" + nome + '\'' +
                ", formato='" + formato + '\'' +
                '}';
    }
}

package code;

public class EnderecadorCaixaAlta extends EnderecadorDecorator {

    public EnderecadorCaixaAlta(Enderecador enderecador) {
        super(enderecador);
    }

    public String preparaEndereco(Endereco endereco) {
        return enderecador.preparaEndereco(endereco).toUpperCase();
    }

}

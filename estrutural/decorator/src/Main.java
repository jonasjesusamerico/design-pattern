import code.*;

public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua 5 Casa 145", "Coloninha", "Tangamandápio", "Michoacán", "-");

        Enderecador enderecador = new EnderecadorSimples();
        enderecador = new EnderecadorCaixaAlta(enderecador);
        enderecador = new EnderecadorComBorda(enderecador);

        String enderecoFormatado = enderecador.preparaEndereco(endereco);

        System.out.println(enderecoFormatado);
    }
}
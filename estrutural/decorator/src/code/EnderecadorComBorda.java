package code;

public class EnderecadorComBorda extends EnderecadorDecorator {

    public EnderecadorComBorda(Enderecador enderecador) {
        super(enderecador);
    }

    public String preparaEndereco(Endereco endereco) {
        String preparaEndereco = enderecador.preparaEndereco(endereco);
        StringBuilder sb = new StringBuilder();
        sb.append("---------------------\n");
        preparaEndereco.lines().forEach(l -> sb.append("| " + l + "\n"));
        sb.append("---------------------");
        return sb.toString();
    }
}

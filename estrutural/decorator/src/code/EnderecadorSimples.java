package code;
/*
*
* Note que esse é a forma simples de enderaçador.
* Para que seja decorado essa enderacor, é necessário criar novas classes implementando o EnderecadorDecorator
*
* */
public class EnderecadorSimples implements Enderecador {
    public String preparaEndereco(Endereco endereco) {
        return endereco.logradouro +
                "\n" +
                endereco.bairro +
                "\n" +
                endereco.cidade +
                '/' +
                endereco.uf +
                "\n" +
                endereco.cep;
    }
}
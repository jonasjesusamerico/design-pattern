package code;

/*
*
* Todas as classes que forem decorar o endereçador, necessitam que seja extendido
*
* */
abstract class EnderecadorDecorator implements Enderecador {
    Enderecador enderecador;

    public EnderecadorDecorator(Enderecador enderecador) {
        super();
        this.enderecador = enderecador;
    }
}

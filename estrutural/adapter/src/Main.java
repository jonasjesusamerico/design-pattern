import implementacoes.composicao.LibInternaComposicao;
import implementacoes.composicao.LibInternaPagamentoComposicao;
import implementacoes.heranca.LibInternaHeranca;
import implementacoes.heranca.LibInternaPagamentoHeranca;
import implementacoes.simples.LibInternaPagamentoSimples;

public class Main {
    public static void main(String[] args) {
        // Adapter de forma simples
        System.out.println("Adapter da forma mais imples");
        LibInternaPagamentoSimples libInternaPagamentoSimples = new LibInternaPagamentoSimples();
        libInternaPagamentoSimples.debitar(10.0);
        libInternaPagamentoSimples.creditar(10.0);

        System.out.println();
        System.out.println("------");
        System.out.println();

        System.out.println("Adapter utilizando da compisção");
        LibInternaComposicao libInternaPagamentoComposicao = new LibInternaPagamentoComposicao();
        libInternaPagamentoComposicao.debitar(11.0);
        libInternaPagamentoComposicao.creditar(11.0);

        System.out.println();
        System.out.println("------");
        System.out.println();

        System.out.println("Adapter utilizando da herança");
        LibInternaHeranca libInternaPagamentoHeranca = new LibInternaPagamentoHeranca();
        libInternaPagamentoHeranca.debitar(11.0);
        libInternaPagamentoHeranca.creditar(11.0);

    }
}
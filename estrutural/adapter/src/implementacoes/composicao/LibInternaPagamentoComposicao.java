package implementacoes.composicao;

import libexterna.LibExternaPagamento;

public class LibInternaPagamentoComposicao implements LibInternaComposicao {

    LibExternaPagamento libExternaPagamento = new LibExternaPagamento();

    @Override
    public void debitar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO COMPOSIÇÃO e estou debitando: R$:" + valor);
        libExternaPagamento.autorizar(valor);
        libExternaPagamento.capturar(valor);
    }

    @Override
    public void creditar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO COMPOSIÇÃO e estou creditando: R$:" + valor);
        libExternaPagamento.creditar(valor);
    }
}

package implementacoes.simples;

import libexterna.LibExternaPagamento;

public class LibInternaPagamentoSimples {

    LibExternaPagamento libExternaPagamento = new LibExternaPagamento();

    public void debitar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO SIMPLES e estou debitando: R$:" + valor);
        libExternaPagamento.autorizar(valor);
        libExternaPagamento.capturar(valor);
    }

    public void creditar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO SIMPLES e estou creditando: R$:" + valor);
        libExternaPagamento.creditar(valor);
    }

}

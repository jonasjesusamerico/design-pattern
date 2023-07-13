package implementacoes.heranca;

import implementacoes.composicao.LibInternaComposicao;
import libexterna.LibExternaPagamento;

public class LibInternaPagamentoHeranca extends LibExternaPagamento implements LibInternaHeranca {


    @Override
    public void debitar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO HERANÇA e estou debitando: R$:" + valor);
        super.autorizar(valor);
        super.capturar(valor);
    }

    @Override
    public void creditar(double valor) {
        System.out.println("Sou a LIB INTERNA DE PAGAMENTO HERANÇA e estou creditando: R$:" + valor);
        super.creditar(valor);
    }
}

package libexterna;

public class LibExternaPagamento {

    public void autorizar(double valor) {
        System.out.println("    Sou a LIB EXTERNA e estou autorizando a transação: R$:" + valor);
    }

    public void capturar(double valor) {
        System.out.println("    Sou a LIB EXTERNA e estou capturando  a transação: R$:" + valor);
    }

    public void creditar(double valor) {
        System.out.println("    Sou a LIB EXTERNA e estou creditando  a transação: R$:" + valor);
    }

}

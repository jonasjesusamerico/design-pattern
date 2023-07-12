import atributostatic.ProdutoFactorySingletonAtributoStatic;
import blazy.ProdutoFactorySingletonLazy;
import cmultithread.ProdutoFactorySingletonMultithread;
import enumm.ProdutoFactorySingletonEnum;
import produto.Produto;

public class Main {
    public static void main(String[] args) {
        Produto produto;

        produto = ProdutoFactorySingletonAtributoStatic.INSTANCE.createProduto("Feijão", 10.0);
        produto.print();

        produto = ProdutoFactorySingletonLazy.getInstance().createProduto("Arroz", 5.0);
        produto.print();

        new Thread(t2).start();
        new Thread(t1).start();

        produto = ProdutoFactorySingletonEnum.INSTANCE.createProduto("Azeite", 8.75);
        produto.print();


    }

    private static Runnable t1 = new Runnable() {
        public void run() {
            try{
                System.out.println("T1");
                ProdutoFactorySingletonMultithread instanceMulti = ProdutoFactorySingletonMultithread.getInstance();
                System.out.println("Instancia multi t1: " + instanceMulti);
                System.out.println("----");
                ProdutoFactorySingletonLazy instanceLazy = ProdutoFactorySingletonLazy.getInstance();
                System.out.println("Instancia lazy t1: " + instanceLazy);
            } catch (Exception e){}

        }
    };

    private static Runnable t2 = new Runnable() {
        public void run() {
            try{
                System.out.println("T2");
                ProdutoFactorySingletonMultithread instanceMulti = ProdutoFactorySingletonMultithread.getInstance();
                System.out.println("Instancia multi t2: " + instanceMulti);
                System.out.println("----");
                ProdutoFactorySingletonLazy instanceLazy = ProdutoFactorySingletonLazy.getInstance();
                System.out.println("Instancia lazy t2: " + instanceLazy);
            } catch (Exception e){}
        }
    };

}
import code.ClienteDoBanco;
import code.ContaBancaria;
import code.Fachada;

public class Main {
    public static void main(String[] args) {
        ClienteDoBanco cliente = new ClienteDoBanco("Maria Campos Rodrigues");
        ContaBancaria conta = new ContaBancaria("1365-9");

        Fachada facade = new Fachada();
        facade.fazerDeposito(150, cliente, conta);
    }
}
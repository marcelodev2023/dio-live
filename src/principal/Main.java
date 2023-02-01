package principal;

public class Main {
    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Marcelo");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.depositar(100d);
        cc.transferir(100d,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
package principal;

public abstract class Conta implements IConta{

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    private static int agenciaPadrao = 123;
    private static int sequencial = 1;

    public Conta(Cliente cliente) {
        this.agencia = agenciaPadrao;
        this.numero = sequencial++;
        this.cliente = cliente;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(Double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(Double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }


    protected void imprimirDados() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println(String.format("Saldo:  %.2f" , this.saldo));
    }
}

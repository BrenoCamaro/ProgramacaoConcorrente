public class Conta {
    private String titular;
    private double saldo;

    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " recebeu R$ " + valor + ". Saldo atual: R$ " + saldo);
    }

    public synchronized boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            System.out.println(titular + " gastou R$ " + valor + ". Saldo atual: R$ " + saldo);
            return true;
        }
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Conta {
    public Conta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public synchronized void depositar(double valor) {
        saldo += valor;
        System.out.println(titular + " recebeu R$ " + valor + ". Saldo atual: R$ " + saldo);
    }
}
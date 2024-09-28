import java.util.Random;

public class Cliente extends Thread {
    private Conta conta;
    private Banco banco;
    private Loja loja1;
    private Loja loja2;
    private Random random;

    public Cliente(String nome, Banco banco, Loja loja1, Loja loja2) {
        this.conta = new Conta(nome, 2000);
        this.banco = banco;
        this.loja1 = loja1;
        this.loja2 = loja2;
        this.random = new Random();
    }

    private void realizarCompras(Loja loja) {
        for (int i = 0; i < 2; i++) {
            double valorCompra = 200 + (300 * random.nextDouble());
            banco.transferir(conta, loja.getConta(), valorCompra);
        }
    }

    @Override
    public void run() {
        realizarCompras(loja1);
        realizarCompras(loja2);
    }
}

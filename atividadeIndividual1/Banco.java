class Banco {
    public synchronized void transferir(Conta origem, Conta destino, double valor) {
        if (origem.sacar(valor)) {
            destino.depositar(valor);
        } else {
            System.out.println("Saldo insuficiente na conta de " + origem);
        }
    }
}
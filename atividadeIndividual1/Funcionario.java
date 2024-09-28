public class Funcionario extends Thread {
    private Conta contaSalario;
    private Conta contaInvestimento;
    private Loja loja;
    private Banco banco;

    public Funcionario(String nome, Loja loja, Banco banco) {
        this.contaSalario = new Conta(nome + " (Salário)", 0);
        this.contaInvestimento = new Conta(nome + " (Investimento)", 0);
        this.loja = loja;
        this.banco = banco;
    }

    public void receberSalario(double valor) {
        contaSalario.depositar(valor);
        double valorInvestimento = valor * 0.2;
        banco.transferir(contaSalario, contaInvestimento, valorInvestimento);
        System.out.println(getName() + " investiu R$ " + valorInvestimento);
    }

    @Override
    public void run() {
        // Pode realizar outras tarefas se necessário
    }
}

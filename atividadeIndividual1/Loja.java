import java.util.ArrayList;
import java.util.List;

public class Loja {
    private Conta conta;
    private String nome;
    private double salarioFuncionarios;
    private List<Funcionario> funcionarios;

    public Loja(String nome, Banco banco) {
        this.nome = nome;
        this.conta = new Conta(nome, 0);
        this.salarioFuncionarios = 1400;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void receberPagamento(double valor) {
        conta.depositar(valor);
        verificarSalario();
    }

    private void verificarSalario() {
        if (conta.getSaldo() >= salarioFuncionarios) {
            for (Funcionario funcionario : funcionarios) {
                funcionario.receberSalario(salarioFuncionarios / funcionarios.size());
            }
            conta.sacar(salarioFuncionarios);
        }
    }

    public Conta getConta() {
        return conta;
    }
}

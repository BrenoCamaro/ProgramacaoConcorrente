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


}

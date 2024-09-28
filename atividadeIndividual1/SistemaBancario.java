public class SistemaBancario {
    public static void main(String[] args) {
        Banco banco = new Banco();
        Loja loja1 = new Loja("Loja 1", banco);
        Loja loja2 = new Loja("Loja 2", banco);

        Funcionario func1 = new Funcionario("Funcionario 1", loja1, banco);
        Funcionario func2 = new Funcionario("Funcionario 2", loja1, banco);
        Funcionario func3 = new Funcionario("Funcionario 3", loja2, banco);
        Funcionario func4 = new Funcionario("Funcionario 4", loja2, banco);

        loja1.adicionarFuncionario(func1);
        loja1.adicionarFuncionario(func2);
        loja2.adicionarFuncionario(func3);
        loja2.adicionarFuncionario(func4);

        Cliente[] clientes = new Cliente[10];
        for (int i = 0; i < 10; i++) {
            clientes[i] = new Cliente("Cliente " + (i + 1), banco, loja1, loja2);
            clientes[i].start();
        }

        try {
            for (Cliente cliente : clientes) {
                cliente.join();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Execução finalizada.");
    }
}

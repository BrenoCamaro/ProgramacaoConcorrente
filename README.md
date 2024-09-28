# Sistema Bancário Multithread em Java

Este projeto representa um sistema bancário utilizando threads em Java. O sistema inclui as seguintes entidades: Banco, Loja, Funcionário, Cliente, e Conta. Cada cliente é uma thread que realiza compras em duas lojas, e cada funcionário recebe seu salário assim que a loja tem fundos suficientes. O banco é responsável por intermediar as transações de forma segura e coordenada.

## Funcionalidades

- Clientes realizam compras em lojas de maneira simultânea, com valores de compra gerados aleatoriamente.
- Funcionários recebem salários das lojas e investem 20% do salário automaticamente em uma conta de investimentos.
- O banco garante a consistência e sincronização dos saldos das contas durante as transações.
- O sistema garante a execução correta e a consistência dos dados, independentemente da ordem das transações.

## Estrutura do Projeto

O projeto está dividido em várias classes, cada uma representando uma entidade do sistema:

- **Conta.java**: Representa uma conta bancária com métodos para depositar e sacar dinheiro.
- **Banco.java**: Intermedia as transações entre as contas, garantindo a consistência e sincronização.
- **Loja.java**: Recebe pagamentos de clientes e paga os salários dos funcionários.
- **Funcionario.java**: Thread que representa um funcionário que recebe salário e investe parte de seu salário.
- **Cliente.java**: Thread que representa um cliente que realiza compras em duas lojas.
- **SistemaBancario.java**: Classe principal que inicializa e executa o sistema.

## Requisitos

- **Java 17** ou superior instalado.
- IDE de sua escolha (Eclipse, IntelliJ, etc.) ou um terminal para compilar e rodar o código manualmente.

## Como Executar o Projeto

### 1. Clonar o Repositório

Faça o clone do repositório localmente ou copie os arquivos Java para um diretório em sua máquina.

### 2. Compilar o Projeto

Se estiver utilizando o terminal, navegue até o diretório do projeto e compile os arquivos Java:

```bash
javac *.java

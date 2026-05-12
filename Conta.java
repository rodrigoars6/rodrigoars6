package sistema_bancario_java;
public class Conta {

    private String titular;
    private int numeroConta;
    private double saldo;

    //Construtor
    public Conta(String titular, int numeroConta, double saldoInicial) {
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    //Método para depositar
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("Valor inválido para depósito.");
        }
    }

    //Método para sacar
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para transferir
    public void transferir(Conta contaDestino, double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            contaDestino.saldo += valor;
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para transferência.");
        }
    }

    // Método para exibir dados da conta
    public void exibirDados() {
        System.out.println("==============================");
        System.out.println("Titular: " + titular);
        System.out.println("Número da Conta: " + numeroConta);
        System.out.println("Saldo: R$ " + saldo);
        System.out.println("==============================");
    }
}
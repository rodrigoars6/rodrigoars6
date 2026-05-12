package sistema_bancario_java;

import java.util.Scanner;

public class Main {
	
	public static void main(String[]args) {
		
		Scanner scanner = new Scanner(System.in);

        System.out.println("===== SISTEMA BANCÁRIO =====");
        
     // Criando primeira conta
        System.out.print("Digite o nome do titular da Conta 1: ");
        String titular1 = scanner.nextLine();
        
        System.out.print("Digite o número da Conta 1: ");
        int numero1 = scanner.nextInt();
        
        System.out.print("Digite o saldo inicial da Conta 1: ");
        double saldo1 = scanner.nextDouble();
        scanner.nextLine();

        Conta conta1 = new Conta(titular1, numero1, saldo1);
        
     // Criando segunda conta
        System.out.print("\nDigite o nome do titular da Conta 2: ");
        String titular2 = scanner.nextLine();

        System.out.print("Digite o número da Conta 2: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o saldo inicial da Conta 2: ");
        double saldo2 = scanner.nextDouble();

        Conta conta2 = new Conta(titular2, numero2, saldo2);

        int opcao;
        
        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1 - Exibir contas");
            System.out.println("2 - Depositar na Conta 1");
            System.out.println("3 - Sacar da Conta 1");
            System.out.println("4 - Transferir da Conta 1 para Conta 2");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            switch (opcao) {

                case 1:
                    conta1.exibirDados();
                    conta2.exibirDados();
                    break;
                    
                case 2:
                    System.out.print("Digite o valor do depósito: ");
                    double deposito = scanner.nextDouble();
                    conta1.depositar(deposito);
                    break;

                case 3:
                    System.out.print("Digite o valor do saque: ");
                    double saque = scanner.nextDouble();
                    conta1.sacar(saque);
                    break;

                case 4:
                    System.out.print("Digite o valor da transferência: ");
                    double transferencia = scanner.nextDouble();
                    conta1.transferir(conta2, transferencia);
                    break;
                case 0:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}

package atividade2;
import java.util.Scanner;
public class Atividade2 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        ContaBancaria conta = new ContaBancaria();

        System.out.print("Digite o nome do titular: ");
        conta.titular = teclado.nextLine();

        conta.saldo = 0;
        conta.extrato = "";

        int opcao;

        do {

            System.out.println("\n===== MENU =====");
            System.out.println("Titular: " + conta.titular);
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Transferir");
            System.out.println("4 - Consultar saldo");
            System.out.println("5 - Alterar titular");
            System.out.println("6 - Extrato");
            System.out.println("7 - Sair");
            System.out.print("Opcao: ");

            opcao = teclado.nextInt();

            switch (opcao) {

                case 1:

                    System.out.print("Digite o valor do depósito: R$ ");
                    double deposito = teclado.nextDouble();

                    conta.depositar(deposito);

                    break;

                case 2:

                    System.out.print("Digite o valor do saque: R$ ");
                    double saque = teclado.nextDouble();

                    conta.sacar(saque);

                    break;

                case 3:

                    System.out.print("Digite o valor da transferência: R$ ");
                    double transferencia = teclado.nextDouble();

                    conta.transferir(transferencia);

                    break;

                case 4:

                    conta.consultarSaldo();

                    break;

                case 5:

                    teclado.nextLine();

                    System.out.print("Digite o novo nome do titular: ");
                    String novoNome = teclado.nextLine();

                    conta.alterarTitular(novoNome);

                    break;

                case 6:

                    conta.mostrarExtrato();

                    break;

                case 7:

                    System.out.println("Programa encerrado.");

                    break;

                default:

                    System.out.println("Opção inválida.");
            }

        } while (opcao != 7);

        teclado.close();
    }
}
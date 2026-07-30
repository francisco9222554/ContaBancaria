package atividade2;

public class ContaBancaria {

    String titular;
    double saldo;
    String extrato;

    void depositar(double valor) {

        if (valor > 0) {
            saldo = saldo + valor;

            extrato = extrato + "Depósito: R$ " + valor + "\n";

            System.out.println("Depósito realizado com sucesso!");
        } else {
            System.out.println("O valor deve ser maior que zero.");
        }
    }

    void sacar(double valor) {

        if (valor > 0) {

            if (valor <= saldo) {
                saldo = saldo - valor;

                extrato = extrato + "Saque: R$ " + valor + "\n";

                System.out.println("Saque realizado com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }

        } else {
            System.out.println("O valor deve ser maior que zero.");
        }
    }

    void transferir(double valor) {

        if (valor > 0) {

            if (valor <= saldo) {
                saldo = saldo - valor;

                extrato = extrato + "Transferência: R$ " + valor + "\n";

                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente.");
            }

        } else {
            System.out.println("O valor deve ser maior que zero.");
        }
    }

    void consultarSaldo() {

        System.out.printf("Saldo atual: R$ %.2f%n", saldo);
    }

    void alterarTitular(String novoNome) {

        titular = novoNome;

        System.out.println("Titular alterado com sucesso!");
    }

    void mostrarExtrato() {

        System.out.println("\n===== EXTRATO =====");

        if (extrato == "") {
            System.out.println("Nenhuma operação realizada.");
        } else {
            System.out.print(extrato);
        }

        System.out.printf("Saldo atual: R$ %.2f%n", saldo);

        System.out.println("===================");
    }
}
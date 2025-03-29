package Banco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Conta juan = new Conta();

        System.out.print("Qual é o valor inicial da sua conta: ");
        juan.saldo = scanner.nextDouble();

        if (juan.saldo <= 500.00) {
            juan.cheque = 50.00;
        } else {
            juan.cheque = juan.saldo / 2.0;
        }

        double limite = juan.cheque;
        int opcao = 0;

        System.out.println("---------- BEM VINDO AO BANCO ----------");

        while (opcao != 7) {

            if (juan.saldo >= juan.conta && juan.conta > 0) {
                juan.VerificarConta(limite);
                juan.saldo -= juan.conta;
                juan.cheque = limite;

                System.out.printf("O valor do cheque especial foi debitado automaticamente da sua conta. R$ %.2f foram pagos%n", juan.conta);
                System.out.println("==================================");

                juan.conta = 0;
            }

            System.out.println("""
                1 - Consultar saldo
                2 - Consultar cheque especial
                3 - Depositar dinheiro
                4 - Sacar dinheiro
                5 - Pagar um boleto
                6 - Verificar se a conta está usando cheque especial
                7 - Sair""");


            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    juan.ConsultarSaldo();
                    break;
                case 2:
                    juan.ConsultarCheque();
                    break;
                case 3:
                    System.out.print("Quanto ira depositar: ");
                    juan.Depositar(scanner.nextDouble());
                    break;
                case 4:
                    System.out.print("Quanto ira sacar: ");
                    juan.Sacar(scanner.nextDouble());
                    break;
                case 5:
                    System.out.print("Qual é o valor do boleto: ");
                    juan.PagarBoleto(scanner.nextDouble());
                    break;
                case 6:
                    juan.VerificarUsoDoCheque(limite);
                    break;
                case 7:
                    System.out.println("Saindo....");
                    break;
            }
            System.out.println("==================================");

        }
        scanner.close();
    }
}

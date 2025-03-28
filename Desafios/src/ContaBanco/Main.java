package ContaBanco;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner dados = new Scanner(System.in);

        System.out.print("Insira o número do banco: ");
        numero = dados.nextInt();
        dados.nextLine();

        System.out.print("Insira o número da agencia: ");
        agencia = dados.nextLine();

        System.out.print("Insira seu nome: ");
        nomeCliente = dados.nextLine();

        System.out.print("Insira seu saldo: ");
        saldo = dados.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma nova conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponivel para saque", nomeCliente, agencia, numero, saldo);

        dados.close();
    }
}

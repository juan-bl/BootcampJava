package Banco;

import java.util.Scanner;

public class Conta {
    double saldo;
    double cheque;
    double conta = 0;

    public void ConsultarSaldo() {
        System.out.printf("Seu saldo atual é de R$ %.2f%n", saldo);
    }

    public void ConsultarCheque() {
        System.out.printf("Seu saldo no cheque especial atual é de R$ %.2f%n", cheque);
    }

    public void Depositar(double valor) {
        saldo += valor;
        System.out.printf("R$ %.2f foram depositados na sua conta%n", valor);
    }

    public void Sacar(double valor) {
        if (valor > saldo && (saldo + cheque) >= valor) {
            saldo -= valor;
            cheque += saldo;
            saldo = 0;
            System.out.printf("R$ %.2f foram sacados da sua conta. CHEQUE ESPECIAL USADO%n", valor);
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("R$ %.2f foram sacados da sua conta%n", valor);
        } else {
            System.out.println("Saldo insuficiente para operação");
        }
    }

    public void PagarBoleto(double valor) {
        if (valor > saldo && (saldo + cheque) >= valor) {
            saldo -= valor;
            cheque += saldo;
            saldo = 0;
            System.out.printf("O boleto de R$ %.2f foi pago com sucesso. CHEQUE ESPECIAL USADO%n", valor);
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.printf("O boleto de R$ %.2f foi pago com sucesso%n", valor);
        } else {
            System.out.println("Saldo insuficiente para operação");
        }
    }

    public void VerificarConta(double limiteCheque) {
        if (limiteCheque > cheque) {
            conta = (((cheque - limiteCheque)* -1) + (((cheque - limiteCheque)* -1) * (20.0/100.0)));
            System.out.printf("Você tem que pagar pelo cheque especial usado, sua conta é de R$ %.2f%n", conta);
        }
    }

    public void VerificarUsoDoCheque(double limiteCheque) {
        System.out.println(limiteCheque);
        System.out.println(cheque);
        if (limiteCheque > cheque) {
            System.out.println("Cheque especial usado");
            VerificarConta(limiteCheque);

        } else {
            System.out.println("Cheque especial não utilizado");
        }
    }
}

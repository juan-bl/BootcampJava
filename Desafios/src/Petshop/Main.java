package Petshop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Petshop pet = new Petshop();
        int opcao = 0;

        System.out.println("---------- BEM VINDO AO PETSHOP ----------");

        while (opcao != 10) {
            System.out.println("""
                1 - Dar banho no pet
                2 - Abastecer com água
                3 - Abastecer com shampoo
                4 - Verificar nivel de água
                5 - Verificar nivel de shampoo
                6 - verificar se tem pet no banho
                7 - colocar pet na maquina
                8 - retirar pet da máquina
                9 - limpar maquina
                10 - Sair""");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    pet.darBanhoNoPet();
                    break;
                case 2:
                    pet.abastecerComAgua();
                    break;
                case 3:
                    pet.abastecerComShampoo();
                    break;
                case 4:
                    pet.verificarNivelDeAgua();
                    break;
                case 5:
                    pet.verificarNivelDeShampoo();
                    break;
                case 6:
                    pet.verificarSeTemPetNoBanho();
                    break;
                case 7:
                    pet.colocarPetNaMaquina();
                    break;
                case 8:
                    pet.retirarPetDaMaquina();
                    break;
                case 9:
                    pet.limparMaquina();
                    break;
                case 10:
                    System.out.println("Saindo....");
                    break;
            }
            System.out.println("==================================");
        }
        scanner.close();
    }
}

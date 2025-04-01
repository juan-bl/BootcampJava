package Petshop;

public class Petshop {

    private int pets = 0;
    private int shampoo = 10;
    private int agua = 30;
    private boolean maquinaLimpa = true;

    public void darBanhoNoPet() {
        if (maquinaLimpa == false && pets == 0) {
            System.out.println("Precisa limpar a maquina primeiro");
        } else {
            if (pets == 1 && shampoo >= 2 && agua >= 10) {
                maquinaLimpa = true;
                agua -= 10;
                shampoo -= 2;
                System.out.println("Banho tomado");
            } else {
                System.out.println("Nenhum Pet para dar banho ou, agua ou shampoo insuficientes");
            }
        }

    }

    public void abastecerComAgua() {
        if (agua < 30) {
            agua += 2;
            System.out.println("Abastecimento completo");
        } else {
            System.out.println("Abastecimento no maximo");
        }

    }

    public void abastecerComShampoo() {
        if (shampoo < 10) {
            shampoo += 2;
            System.out.println("Abastecimento completo");
        } else {
            System.out.println("Abastecimento no maximo");
        }
    }

    public void verificarNivelDeAgua() {
        System.out.println("Água: " + agua + " litros");
    }

    public void verificarNivelDeShampoo() {
        System.out.println("Shampoo: " + shampoo + " litros");
    }

    public void verificarSeTemPetNoBanho() {
        if (pets == 1) {
            System.out.println("Tem pet no banho");
        } else {
            System.out.println("Não tem pet no banho");
        }
    }

    public void colocarPetNaMaquina() {
        if (pets < 1) {
            pets++;
            maquinaLimpa = false;
            System.out.println("Pet na maquina");
        } else {
            System.out.println("Apenas um Pet por vez");
        }
    }

    public void retirarPetDaMaquina() {
        if (pets == 1) {
            pets--;
        } else {
            System.out.println("Não tem nenhum Pet na maquina");
        }
    }

    public void limparMaquina() {
        if (agua >= 3 && shampoo >= 1) {
            maquinaLimpa = true;
            agua -= 3;
            shampoo -= 1;
            System.out.println("Maquina limpa;");
        } else {
            System.out.println("Sem agua o shampoo suficiente");
        }

    }
}

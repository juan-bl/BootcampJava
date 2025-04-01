package Carro;

public class Carro {
    private boolean ligado = false;
    private int marcha = 0;
    private int velocidade = 0;

    public boolean getligado() {
        return ligado;
    }

    public void LigarCarro() {
        if (ligado == false) {
            ligado = true;
            System.out.println("Carro ligado");
        } else {
            System.out.println("O carro já está ligado");
        }
    }

    public void DesligarCarro() {
        if (marcha == 0 && velocidade == 0) {
            ligado = false;
            System.out.println("Carro desligado");
        } else {
            System.out.println("O carro não está em condições para ser desligado");
        }
    }

    public void Acelerar() {
        if (marcha == 0) {
            System.out.println("Carro em ponto morto");
        } else if (marcha == 1 && velocidade <= 20) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm%n", velocidade);
        } else if (marcha == 2 && velocidade <= 40) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm%n", velocidade);
        } else if (marcha == 3 && velocidade <= 60) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm%n", velocidade);
        } else if (marcha == 4 && velocidade <= 80) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm%n", velocidade);
        } else if (marcha == 5 && velocidade <= 100) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm%n", velocidade);
        } else if (marcha == 6 && velocidade <= 120) {
            velocidade++;
            System.out.printf("Velocidade aumentada para %dkm. Velocidade maxima%n", velocidade);
        } ;
    }

    public void Desacelerar() {
        if (velocidade > 0) {
            velocidade --;
            System.out.printf("Velocidade diminuida para %dkm%n", velocidade);
        } else {
            System.out.println("Carro parado na velocidade 0km");
        }
    }

    public void Virar() {
        if (velocidade >= 1 && velocidade <= 40) {
            System.out.println("Carro virou a rua");
        } else {
            System.out.println("O carro não está em condições de virar");
        }
    }

    public void VerificarVelocidade() {
        System.out.printf("A veocidade atual é de %dkm%n",velocidade);
    }

    public void AumentarMacha() {
        if (marcha <= 6) {
            marcha ++;
            System.out.println("Marcha no " + marcha);
        } else {
            System.out.println("Marcha no maximo");
        }
    }

    public void DiminuirMacha() {
        if (marcha >= 0) {
            marcha--;
        } else {
            System.out.println("Marcha no minimo");
        }
    }
}

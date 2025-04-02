package ingressos;

public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso();
        ingresso.valorDoIngresso();

        System.out.println();

        MeiaEntrada meiaEntrada = new MeiaEntrada();
        meiaEntrada.valorDoIngresso();

        System.out.println();

        Familia familia = new Familia(4);
        familia.valorDoIngresso();
    }
}

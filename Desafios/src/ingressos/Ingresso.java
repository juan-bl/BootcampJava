package ingressos;

public class Ingresso {
    double valor = 30.00;
    String nomeDoFilme = "Minecraft";
    String tipo = "Dublado";

    public void valorDoIngresso() {
        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor: R$ " + valor);
    }
}

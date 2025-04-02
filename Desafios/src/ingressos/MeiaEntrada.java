package ingressos;

public class MeiaEntrada extends Ingresso {

    @Override
    public void valorDoIngresso() {
        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Tipo: " + tipo);
        System.out.println("Valor da meia é: R$ " + valor/2);
    }
}

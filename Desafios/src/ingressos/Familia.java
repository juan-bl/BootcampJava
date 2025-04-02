package ingressos;

public class Familia extends Ingresso {

    int pessoas;

    public Familia(int pessoas) {
        this.pessoas = pessoas;
    }

    @Override
    public void valorDoIngresso() {
        System.out.println("Filme: " + nomeDoFilme);
        System.out.println("Tipo: " + tipo);
        if (pessoas > 3) {
            double ingressoFamilia = ((valor*pessoas)-((valor*pessoas) * (5.0/100.0)));
            System.out.printf("Valor do ingreso para %d pessoas, fica R$ %.2f ao todo%n", pessoas, ingressoFamilia);
        } else {
            System.out.printf("Valor do ingreso para %d pessoas, fica R$ %.2f pra cada%n", pessoas, valor*pessoas);
        }

    }
}

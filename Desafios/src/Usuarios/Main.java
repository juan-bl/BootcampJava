package Usuarios;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Juan", "juan@email.com", "1234");

        Vendedor vendedor = new Vendedor("Pedro", "pedro@email.coom", "1234", 5);

        Atendente atendente = new Atendente("Flavio", "flavio@email.com", "1234", 500.50);

        gerente.ConsultarVendas(vendedor);
        vendedor.RealizarVendas();
        vendedor.RealizarVendas();
        vendedor.RealizarVendas();
        gerente.ConsultarVendas(vendedor);
    }
}

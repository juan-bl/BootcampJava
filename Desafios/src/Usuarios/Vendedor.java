package Usuarios;

public class Vendedor extends Gerente {
    String nome;
    String email;
    String senha;
    int quantidadeDeVendas;
    boolean admin = false;

    public Vendedor(String nome, String email, String senha, int quantidadeDeVendas) {
        super(nome, email, senha);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getSenha() {
        return senha;
    }

    @Override
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }

    @Override
    public boolean isAdmin() {
        return admin;
    }

    public void RealizarVendas() {
        quantidadeDeVendas++;
        System.out.println("Venda realizada");
    }
}

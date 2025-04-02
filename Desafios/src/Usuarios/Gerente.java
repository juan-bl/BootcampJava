package Usuarios;

public class Gerente {
    String nome;
    String email;
    String senha;
    boolean admin = true;

    public Gerente(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isAdmin() {
        return admin;
    }

    private void GerarRelatorioFinanceiro() {
        System.out.println("Relatorio");
    }

    public void ConsultarVendas(Vendedor usuario) {
        System.out.println(usuario.getQuantidadeDeVendas());

    }

    public void RealizarLogin() {}

    public void RealizarLogff() {}

    public void AlterarDados() {}

    public void AlterarSenha() {}

}

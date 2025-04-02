package Usuarios;

public class Atendente extends Gerente {
    String nome;
    String email;
    String senha;
    double valorEmCaixa;
    boolean admin = false;

    public Atendente(String nome, String email, String senha, double valorEmCaixa) {
        super(nome, email, senha);
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.valorEmCaixa = valorEmCaixa;
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

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    @Override
    public boolean isAdmin() {
        return admin;
    }

    private void ReceberPagamentos(double pagamento) {
        valorEmCaixa += pagamento;
    }

    private void FecharCaixa() {
        System.out.println("Caixa fechado");
    }
}

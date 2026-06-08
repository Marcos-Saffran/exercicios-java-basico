package br.com.marcos.users;

public abstract class User {

    protected String nome;
    protected String email;
    protected String senha;
    private final boolean ehAdministrador;

    public User(String nome, String Email, String Senha) {
        this.nome = nome;
        this.email = Email;
        this.senha = Senha;
        this.ehAdministrador = this instanceof Gerente;
    }

    public String getNome() {
        return nome;
    }

    public void realizarLogin(String nome, String senha){
        if (this.nome.equalsIgnoreCase(nome) && this.senha.equals(senha)) {
            System.out.println("Login realizado com sucesso.");
        } else {
            System.out.println("Nome ou senha inválidos. Tente novamente.");
        }
    }

    public void realizarLogOff(){
        System.out.println("Logoff realizado com sucesso.");
    }

    public void alterarDados(String nome, String email, String senha){
        alterarNome(nome);
        alterarEmail(email);
        alterarSenha(senha);
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void alterarSenha(String senha){
        this.senha = senha;
    }

    public void alterarEmail(String email){
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "nome='" + nome + '\'' +
                ", Email='" + email + '\'' +
                ", Senha='" + senha + '\'' +
                ", ehAdministrador=" + ehAdministrador +
                '}';
    }
}

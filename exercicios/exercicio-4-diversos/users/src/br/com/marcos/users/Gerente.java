package br.com.marcos.users;

public class Gerente extends User{

    public Gerente(String nome, String Email, String Senha) {
        super(nome, Email, Senha);
    }

    public void gerarRelatorioFinanceiro(){
        System.out.println("Relatório financeiro gerado.");
    }

    public void consultarVendas(){
        System.out.println("Consulta de Vendas realizada.");
    }


}

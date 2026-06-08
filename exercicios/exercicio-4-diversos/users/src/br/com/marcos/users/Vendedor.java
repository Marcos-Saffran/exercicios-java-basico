package br.com.marcos.users;

public class Vendedor extends User{

    private int quantidadeDeVendas;

    public Vendedor(String nome, String Email, String Senha) {
        super(nome, Email, Senha);
        this.quantidadeDeVendas = 0;
    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }

    public void realizarVenda(){
        this.quantidadeDeVendas++;
        System.out.println("Venda realizada. Total de vendas: " + this.quantidadeDeVendas);
    }

    public void consultarVendas(){
        System.out.println("Quantidade de vendas: " + this.quantidadeDeVendas);
        System.out.println("Consulta de Vendas realizada.");
    }
}

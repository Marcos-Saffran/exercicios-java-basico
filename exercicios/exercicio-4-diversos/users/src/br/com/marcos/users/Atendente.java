package br.com.marcos.users;

public class Atendente extends User {

    private double valorEmCaixa;
    public Atendente(String nome, String Email, String Senha) {
        super(nome, Email, Senha);
        this.valorEmCaixa = 0;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamento(double pagamento){
        this.valorEmCaixa += pagamento;
    }

    public void fecharCaixa(double valorEmCaixa){
        if (this.valorEmCaixa != valorEmCaixa){
            System.out.println("Valor em caixa não confere. Fechamento do caixa falhou.");
            System.out.println("Valor informado: " + valorEmCaixa);
            System.out.println("Valor no caixa: " + this.valorEmCaixa);
        } else {
            System.out.println("Caixa fechado com sucesso. Valor total: " + this.valorEmCaixa);
            this.valorEmCaixa = 0; // Resetar o valor em caixa após o fechamento
        }
    }


}

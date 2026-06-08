package br.com.marcos.userMain;

import br.com.marcos.users.Atendente;
import br.com.marcos.users.Gerente;
import br.com.marcos.users.Vendedor;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bem-vindo ao sistema de usuários!");

        System.out.println("==== Gerente ====");
        Gerente gerente = new Gerente("Gerente", "gerente@gerente.com.br", "123");
        System.out.println(gerente);
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.realizarLogin("Gerente", "123");
        gerente.realizarLogin("GerenteHack", "senhaHack");
        gerente.realizarLogOff();
        gerente.alterarDados("Novo nome", "novoemail", "nova senha");
        System.out.println(gerente);

        System.out.println("==== Vendedor ====");
        Vendedor vendedor = new Vendedor("Vendedor", "vendedor@vendedor.com.br", "123");
        System.out.println(vendedor);
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.realizarLogin("Vendedor", "123");
        vendedor.realizarLogin("VendedorHack", "senhaHack");
        vendedor.realizarLogOff();
        vendedor.alterarDados("Novo nome", "novoemail", "nova senha");
        System.out.println(vendedor);

        System.out.println("==== Atendente ====");
        Atendente atendente = new Atendente("Atendente", "atendente@atendente.com.br", "123");
        System.out.println(atendente);
        atendente.receberPagamento(100);
        atendente.fecharCaixa(100);
        atendente.fecharCaixa(50);
        atendente.realizarLogin("Atendente", "123");
        atendente.realizarLogin("AtendenteHack", "senhaHack");
        atendente.realizarLogOff();
        atendente.alterarDados("Novo nome", "novoemail", "nova senha");
        System.out.println(atendente);


    }

}

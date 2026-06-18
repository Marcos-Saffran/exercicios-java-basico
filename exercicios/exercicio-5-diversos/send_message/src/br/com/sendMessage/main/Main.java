package br.com.sendMessage.main;

import br.com.sendMessage.senders.Email;
import br.com.sendMessage.senders.SMS;
import br.com.sendMessage.senders.SocialMedia;
import br.com.sendMessage.senders.WhatsApp;

import java.util.Scanner;

public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static String mensagem = "";

    public static void main(String[] args) {


        System.out.println("Bem vindo ao envio de mensagens.");


        int opcao;
        boolean continuar = true;
        while(continuar){
            System.out.println("---------------------------------------------");
            System.out.println("Escolha o meio de envio da mensagem:");
            System.out.println("1 - E-mail");
            System.out.println("2 - SMS");
            System.out.println("3 - WhatsApp");
            System.out.println("4 - Social Media");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1 -> {
                    askForMessage();
                    Email email = new Email();
                    email.sendMessage(mensagem);
                }
                case 2 -> {
                    askForMessage();
                    SMS sms = new SMS();
                    sms.sendMessage(mensagem);
                }
                case 3 -> {
                    askForMessage();
                    WhatsApp whatsapp = new WhatsApp();
                    whatsapp.sendMessage(mensagem);
                }
                case 4 -> {
                    askForMessage();
                    SocialMedia socialMedia = new SocialMedia();
                    socialMedia.sendMessage(mensagem);
                }
                case 0 -> {
                    continuar = false;
                    System.out.println("Encerrando  o programa. Obrigado por usar nosso serviço!");
                }
                default -> System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
            }
        }
    }

    private static void askForMessage() {
        System.out.print("Digite a mensagem: ");
        mensagem = scanner.nextLine();
    }
}

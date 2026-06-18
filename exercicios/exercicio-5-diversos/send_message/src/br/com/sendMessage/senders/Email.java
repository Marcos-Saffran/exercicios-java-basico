package br.com.sendMessage.senders;

public class Email implements ISendMessage {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem por E-mail.");
        System.out.println(message);
        System.out.println("Mensagem enviada por E-mail!");
    }
}

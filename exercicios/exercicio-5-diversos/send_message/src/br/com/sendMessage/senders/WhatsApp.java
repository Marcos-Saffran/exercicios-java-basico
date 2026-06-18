package br.com.sendMessage.senders;

public class WhatsApp implements ISendMessage {
    @Override
    public void sendMessage(String message) {
        System.out.println("Enviando mensagem por WhatsApp...");
        System.out.println(message);
        System.out.println("Mensagem enviada por WhatsApp com sucesso!");
    }
}

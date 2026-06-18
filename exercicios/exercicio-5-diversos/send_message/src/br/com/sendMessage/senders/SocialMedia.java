package br.com.sendMessage.senders;

public class SocialMedia implements ISendMessage{
    @Override
    public void sendMessage(String message){
        System.out.println("Enviando mensagem por Social Media...");
        System.out.println(message);
        System.out.println("Mensagem enviada por Social Media com sucesso!");
    }
}

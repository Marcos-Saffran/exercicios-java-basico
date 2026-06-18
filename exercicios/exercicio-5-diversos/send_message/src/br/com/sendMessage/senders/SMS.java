package br.com.sendMessage.senders;

public class SMS implements ISendMessage{
    @Override
    public void sendMessage(String message){
        System.out.println("Enviando mensagem por SMS...");
        System.out.println(message);
        System.out.println("Mensagem enviada por SMS com sucesso!");
    }
}

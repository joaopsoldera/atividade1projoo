public class SMS extends Notificacao {

    public SMS(String mensagem) {
        super(mensagem);
    }

    @Override
    public void sendNotification() {
        System.out.println("SMS: " + mensagem);
    }
}
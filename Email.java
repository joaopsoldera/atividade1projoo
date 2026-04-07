public class Email extends Notificacao {

    public Email(String mensagem) {
        super(mensagem);
    }

    @Override
    public void sendNotification() {
        System.out.println("Email: " + mensagem);
    }
}
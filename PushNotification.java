public class PushNotification extends Notificacao {

    public PushNotification(String mensagem) {
        super(mensagem);
    }

    @Override
    public void sendNotification() {
        System.out.println("Push: " + mensagem);
    }
}
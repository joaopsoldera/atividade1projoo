public class PushNotificationFactory implements NotificacaoFactory {
    @Override
    public Notificacao create(String mensagem) {
        return new PushNotification(mensagem);
    }
}
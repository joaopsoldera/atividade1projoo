public class SMSNotificationFactory implements NotificacaoFactory {
    @Override
    public Notificacao create(String mensagem) {
        return new SMS(mensagem);
    }
}
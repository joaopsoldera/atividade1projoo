public class EmailNotificationFactory implements NotificacaoFactory {
    @Override
    public Notificacao create(String mensagem) {
        return new Email(mensagem);
    }
}
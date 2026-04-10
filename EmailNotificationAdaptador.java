public class EmailNotificationAdaptador implements NotificacaoInterface {

    private Email em;

    public EmailNotificationAdaptador(Email em) {
        this.em = em;
    }

    @Override
    public void sendNotification() {
        api.send();
    }
}
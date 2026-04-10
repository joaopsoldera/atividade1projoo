public class PushNotificationAdaptador implements NotificacaoInterface {

    private PushNotification psn;

    public PushNotificationAdaptador(PushNotification psn) {
        this.psn = psn;
    }

    @Override
    public void sendNotification() {
        psn.send();
    }
}
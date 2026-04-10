public class APIExternaAdapter implements NotificacaoInterface {

    private APIExterna api;

    public APIExternaAdapter(APIExterna api) {
        this.api = api;
    }

    @Override
    public void sendNotification() {
        api.send();
    }
}
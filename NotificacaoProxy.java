public class NotificacaoProxy implements NotificacaoInterface {

    private Notificacao notificacao;
    private int limite;

    public NotificacaoProxy(Notificacao notificacao, int limite) {
        this.notificacao = notificacao;
        this.limite = limite;
    }

    @Override
    public void sendNotification() {
        if (notificacao.contadorEnvios < limite) {
            notificacao.contadorEnvios++;
            notificacao.sendNotification();
        } else {
            System.out.println("Limite de envios atingido!");
        }
    }
}
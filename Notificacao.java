public abstract class Notificacao {
    protected String mensagem;
    protected int contadorEnvios = 0;

    public Notificacao(String mensagem) {
        this.mensagem = mensagem;
    }

    public abstract void sendNotification();
}
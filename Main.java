public class Main {
    public static void main(String[] args) {
        Sistema sistema = Sistema.getInstance("MeuApp", "smtp.server.com", 2);
        sistema.exibirConfiguracoes();

        NotificacaoFactory emailFactory = new EmailNotificationFactory();
        NotificacaoFactory smsFactory = new SMSNotificationFactory();
        NotificacaoFactory pushFactory = new PushNotificationFactory();

        Notificacao email = emailFactory.create("Olá por email!");
        Notificacao sms = smsFactory.create("Olá por SMS!");
        Notificacao push = pushFactory.create("Olá por push!");

        NotificacaoInterface emailProxy = new NotificacaoProxy(email, 2);
        NotificacaoInterface smsProxy = new NotificacaoProxy(sms, 1);

        emailProxy.sendNotification();
        emailProxy.sendNotification();
        emailProxy.sendNotification(); 

        smsProxy.sendNotification();
        smsProxy.sendNotification();

        APIExterna api = new APIExterna();
        NotificacaoInterface apiAdapter = new APIExternaAdapter(api, "Mensagem via API externa");

        apiAdapter.sendNotification();
    }
}
public class Main {
    public static void main(String[] args) {

        // Singleton
        Sistema sistema = Sistema.getInstance("MeuApp", "smtp.server.com", 3);
        sistema.exibirConfiguracoes();

        // Factory
        NotificacaoFactory emailFactory = new EmailNotificationFactory();
        NotificacaoFactory smsFactory = new SMSNotificationFactory();
        NotificacaoFactory pushFactory = new PushNotificationFactory();

        Notificacao n1 = emailFactory.create("Olá por email!");
        Notificacao n2 = smsFactory.create("Olá por SMS!");
        Notificacao n3 = pushFactory.create("Olá por push!");

        n1.sendNotification();
        n2.sendNotification();
        n3.sendNotification();
    }
}
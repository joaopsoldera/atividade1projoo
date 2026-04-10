public class SMSNotificationAdaptador implements NotificacaoInterface {
	private SMS sms;
	private String mensagem;

	SMSNotificationAdaptador(SMS sms, String mensagem) {
		this.sms = sms;
		this.mensagem = mensagem;
	}

	public void sendNotification() {
		sms.sendNotification(mensagem);
	}
}

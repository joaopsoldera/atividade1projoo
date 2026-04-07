public class Sistema {

    private String nomeAplicacao;
    private String servidorDestino;
    private int qtdMaxReenvio;

    private static Sistema instance;

    private Sistema(String nome, String servidor, int qtdMax) {
        this.nomeAplicacao = nome;
        this.servidorDestino = servidor;
        this.qtdMaxReenvio = qtdMax;
    }

    public static Sistema getInstance(String nome, String servidor, int qtdMax) {
        if (instance == null) {
            instance = new Sistema(nome, servidor, qtdMax);
        }
        return instance;
    }

    public void exibirConfiguracoes() {
        System.out.println("App: " + nomeAplicacao);
        System.out.println("Servidor: " + servidorDestino);
        System.out.println("Max Reenvios: " + qtdMaxReenvio);
    }
}
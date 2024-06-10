public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //métodos ReprodutorMusical
    public void tocar() {
        System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }

    //métodos AparelhoTelefônico
    public void ligar() {
        System.out.println("Ligando para contato");
    }

    public void atender() {
        System.out.println("Atendendo ligação");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz");
    }

    //métodos NavegadorInternet
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
   
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }
    
    public void atualizarPagina() {
        System.out.println("Atualizando página");
    }
    
    public static void main(String[] args) {
        IPhone iphone = new IPhone();
        iphone.selecionarMusica("Sky is a neighborhood");
        iphone.atender();
        iphone.exibirPagina("https://web.dio.me");
    }    
}

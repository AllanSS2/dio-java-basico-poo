package iphone;

public class Usuario {
    public static void main(String[] args) {
        Iphone iphone1 = new Iphone();

        // Testando ReprodutorMusical
        iphone1.selecionarMusica("Love Me Again");
        iphone1.tocar();
        iphone1.pausar();

        // Testando AparelhoTelefonico
        iphone1.ligar("11 94011-5988");
        iphone1.iniciarCorreioVoz();
        iphone1.atender();

        // Testando NavegadorInternet
        iphone1.exibirPagina("https://www.google.com");
        iphone1.atualizarPagina();
        iphone1.adicionarNovaAba();
    }
    

}

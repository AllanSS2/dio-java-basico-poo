package iphone;

import iphone.funcionalidades.*;

public class Iphone implements AparelhoTelefonico , NavegadorInternet,ReprodutorMusical  {

    @Override
    public void atender() {
        System.out.println("Atendeu!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciou correio de voz!");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligar para número: " + numero);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba!");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página!");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    @Override
    public void pausar() {
        System.out.println("Pausar música!");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionar música: " + musica);
    }

    @Override
    public void tocar() {
        System.out.println("Tocar música!");
    }
    
}

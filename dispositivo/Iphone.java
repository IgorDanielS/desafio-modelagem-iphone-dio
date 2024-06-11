package dispositivo;

import funcionalidades.AparelhoTelefonico;
import funcionalidades.NavegadorInternet;
import funcionalidades.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {

    @Override
    public void tocar() {
        System.out.println("Tocando a música...");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando a música...");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a música " + musica);
    }

    @Override
    public void verAlbuns() {
        System.out.println("Mostrando os albuns...");
    }

    @Override
    public void aumentarVolume() {
        System.out.println("Aumentando o volume...");
    }

    @Override
    public void diminuirVolume() {
        System.out.println("Diminuindo o volume...");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url);
    }

    @Override
    public void adicionarAba() {
        System.out.println("Adicionando uma nova aba...");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando a página...");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para o número " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }

    @Override
    public void colocarEmEspera(String pessoa)
    {
        System.out.println("Colocando " + pessoa + " em espera...");
    }

    @Override
    public void iniciarConferencia()
    {
        System.out.println("Iniciando conferência...");
    }
    
    @Override
    public void googleMaps()
    {
        System.out.println("Iniciando google maps...");
    }

    @Override
    public void mandarEmail(String assunto, String destinatario)
    {
        System.out.println("Mandando email para " + destinatario + " com assunto de " + assunto);
    }
}

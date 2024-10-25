/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package iphone;

/**
 *
 * @author lucas
 */
public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();
        
        meuIphone.tocar();
        meuIphone.selecionarMusica("Imagine");
        meuIphone.pausar();

        meuIphone.ligar("123456789");
        meuIphone.atender();
        meuIphone.iniciarCorreioVoz();

        meuIphone.exibirPagina("www.google.com");
        meuIphone.adicionarNovaAba();
        meuIphone.atualizarPagina();
    }
}
    
}


# Componente iPhone - Modelagem UML e Implementação em Java

Este projeto faz parte de um desafio de modelagem e diagramação UML do componente iPhone, abrangendo funcionalidades como **Reprodutor Musical**, **Aparelho Telefônico** e **Navegador na Internet**. Além da modelagem UML, as classes e interfaces foram implementadas em Java.

## Funcionalidades Modeladas

### Reprodutor Musical
- `tocar()`
- `pausar()`
- `selecionarMusica(String musica)`

### Aparelho Telefônico
- `ligar(String numero)`
- `atender()`
- `iniciarCorreioVoz()`

### Navegador na Internet
- `exibirPagina(String url)`
- `adicionarNovaAba()`
- `atualizarPagina()`

## Diagrama UML

Abaixo está o diagrama UML que representa a estrutura das classes e interfaces do iPhone:

![Diagrama UML](https://github.com/user-attachments/assets/77e74f62-410f-4b73-a757-439cb4903f73)

## Implementação em Java

As seguintes interfaces e classes foram implementadas para representar as funcionalidades do iPhone:

- `ReprodutorMusical.java`
- `AparelhoTelefonico.java`
- `NavegadorInternet.java`
- `iPhone.java`

### Estrutura do projeto
### Exemplo de Execução

No arquivo `Main.java`, você pode testar todas as funcionalidades implementadas:

```java
public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        
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

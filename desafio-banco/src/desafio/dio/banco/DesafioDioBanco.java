/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author lucas
 */
public class DesafioDioBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Banco banco = new Banco("Banco");
        
        Cliente cliente1 = new Cliente("riardo", "ricardo@gmail", "119999999", "11111111111");
        
        Cliente cliente2 = new Cliente("riardo", "ricardo@gmail", "119999999", "22222222222");
        
        Conta cc = new ContaCorrente(cliente1, 500);
     
        Conta cc2 = new ContaCorrente(cliente2, 500);
        
        banco.adicionarConta(cc);
        
        banco.adicionarConta(cc2);
        
        Conta cp = new ContaPoupanca(cliente1);
        
        banco.quantidadeClientes();
        
        cc.depositar(1000.00);
        cc.imprimirExtrato();
        
        try {
            cc.sacar(1300.00);
            System.out.println("Saque realizado com sucesso!");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
        
        try {
            cc.sacar(300.00);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        cc.imprimirExtrato();
        
    }
    
}

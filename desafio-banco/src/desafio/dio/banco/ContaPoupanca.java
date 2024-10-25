/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author lucas
 */
public class ContaPoupanca extends Conta {
    
    public ContaPoupanca(Cliente cliente){
        super(cliente);
    }
    
    public void imprimirExtrato(){
        System.out.println("\n===CONTA poupança===");
        super.imprimirExtrato();
    }
}

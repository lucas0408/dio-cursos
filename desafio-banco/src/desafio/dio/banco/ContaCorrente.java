/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author lucas
 */
public class ContaCorrente extends Conta {
    
    private double limite;
    
    public ContaCorrente(Cliente cliente, double limite){
        super(cliente);
        this.limite = limite;
    }
    
    //parte da regra de negocio que conta corrente possuem um limite alem do saldo
    public void sacar(double valor){
        if((saldo + limite) >= valor){
            saldo -= valor;
        }else{
            throw new IllegalArgumentException("Saldo insuficiente, incluindo o limite disponível.");
        }
    }
    
    public void imprimirExtrato(){
        System.out.println("\n===CONTA CORRENTE===");
        super.imprimirExtrato();

    }
}

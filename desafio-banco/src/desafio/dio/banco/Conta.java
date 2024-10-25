/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco;

/**
 *
 * @author lucas
 */
public class Conta {
    
    private static int SEQUENCIAL = 1;
    protected static final int AGENCIA_PADRAO = 1;
    
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;
    
    public Conta(Cliente cliente){
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL;
        this.cliente = cliente;
    }
    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }
    
    public void sacar(double valor){
        if(saldo >= valor){
            saldo = saldo - valor;
        }else{
            throw new IllegalArgumentException("Saldo insuficiente, incluindo o limite disponível.");
        }
    }
    
    public void depositar(double valor){
        saldo = saldo + valor;
    }
    
    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    void imprimirExtrato() {
        System.out.println("\ncliente: " + this.cliente.getNome());
        System.out.println("O saldo é: " + this.saldo);
        System.out.println("O numero da conta é: " + this.numero);
        System.out.println("O numero da agencia é: " + this.agencia);
    }
}

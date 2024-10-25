/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.dio.banco;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author lucas
 */
public class Banco {
    
    private String nome;
    private List<Conta> conta;
    
    public Banco(String nome){
        this.nome = nome;
        this.conta = new ArrayList<>();
    }
    
    //parte da regra de negocio em que um cliente pode ter multiplas contas
    public void quantidadeClientes(){
        int quantidade = conta.stream()
                        .map(Conta::getCliente)  
                        .distinct() 
                        .collect(Collectors.toList()).size();
        System.out.println("a quantidade de clientes no banco é: " + quantidade);
    }
    
    public void adicionarConta(Conta conta) {
        this.conta.add(conta);
        System.out.println("Conta adicionada com sucesso!");
    }
       
}

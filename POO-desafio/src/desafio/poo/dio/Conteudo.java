/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package desafio.poo.dio;

/**
 *
 * @author lucas
 */
public abstract class Conteudo {
    
    protected final double XP_PADRAO = 10d;
    
    private String titulo;
    private String descricao;
    
    public abstract double calcularXp();
        

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Conteudo{" + "XP_PADRAO=" + XP_PADRAO + ", titulo=" + titulo + ", descricao=" + descricao + '}';
    }
    
    
}

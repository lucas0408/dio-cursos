/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package desafio.poo.dio;

import java.time.LocalDate;

/**
 *
 * @author lucas
 */
public class DesafioPOODio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  
       Curso curso1 = new Curso();
       curso1.setTitulo("curso java");
       curso1.setDescricao("descricao curo java");
       curso1.setCargaHoraria(4);        
// TODO code application logic here
       Curso curso2 = new Curso();
       curso2.setTitulo("curso js");
       curso2.setDescricao("descricao curo js");
       curso2.setCargaHoraria(4);
       
       Mentoria mentoria = new Mentoria();
       mentoria.setTitulo("mentoria de java");
       mentoria.setDescricao("descrição mentoria de java");
       mentoria.setData(LocalDate.now());
       
       
       Bootcamp bootcamp = new Bootcamp();
       bootcamp.setNome("bootcamp java developer");
       bootcamp.setDescricao("descricao");
       bootcamp.getConteudos().add(curso1);
       bootcamp.getConteudos().add(curso2);
       bootcamp.getConteudos().add(mentoria);
       
       Dev devCamila = new Dev();
       devCamila.setNome("camila");
       devCamila.inscreverBootcamp(bootcamp);
       System.out.println("Conteudo inscritos Camila: " + devCamila.getConteudosInscritos());
       devCamila.progredir();
       System.out.println("-");
       System.out.println("Conteudo inscritos Camila: " + devCamila.getConteudosInscritos());
       System.out.println("Conteudo inscritos Camila: " + devCamila.getConteudosConcluidos());
       System.out.println("XP:" + devCamila.calcularXp());
       
       System.out.println("-------------");
       
       Dev devJoao = new Dev();
       devCamila.setNome("joão");
       devCamila.inscreverBootcamp(bootcamp);
       System.out.println("Conteudo inscritos joão: " + devCamila.getConteudosInscritos());
       devCamila.progredir();
       System.out.println("Conteudo inscritos joão: " + devCamila.getConteudosConcluidos());
       System.out.println("XP:" + devCamila.calcularXp());
    }
    
}

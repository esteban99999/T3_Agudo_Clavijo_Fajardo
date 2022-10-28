/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author esteb
 */
public class Principal {
    
    public static void main(String[] args) {
     
        Profesor Rene = new Profesor("Rene Avila","Electricidad",5,4);
        Asignatura Circuitos = new Asignatura("circuitos Electricos",160,6,"Boylestad");
        Grupo Grupo1 = new Grupo(4,"Mario Rizini",Circuitos,Rene);
 
        System.out.println(Rene.getInfo());
        System.out.println(Circuitos.getInfo());
        System.out.println(Grupo1.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Profesor Maria = new Profesor("Maria Caridad","Programacion",2,3);
        Asignatura Progra = new Asignatura("Programacion",140,3,"Aprende a programar");
        Grupo Grupo2 = new Grupo(2,"Mario Rizini",Progra,Maria);
 
        System.out.println(Maria.getInfo());
        System.out.println(Progra.getInfo());
        System.out.println(Grupo2.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Profesor Jhison = new Profesor("Jhison Romero","Calculo Integral",3,4);
        Asignatura Calculo = new Asignatura("Calculo integral",150,3,"Calculo II");
        Grupo Grupo3 = new Grupo(1,"Mario Rizini",Calculo,Jhison);
 
        System.out.println(Jhison.getInfo());
        System.out.println(Calculo.getInfo());
        System.out.println(Grupo3.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Profesor Pepe = new Profesor("Pepe Sarmiento","Física",2,3);
        Asignatura Fisica = new Asignatura("Física",160,6,"Fisica I");
        Grupo Grupo4 = new Grupo(2,"Mario Rizini",Fisica,Pepe);
 
        System.out.println(Pepe.getInfo());
        System.out.println(Fisica.getInfo());
        System.out.println(Grupo4.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Profesor Cesar = new Profesor("Cesar Agudo","Antropología",4,1);
        Asignatura Antropologia = new Asignatura("Antropologia",150,4,"Vida y Trascendencia");
        Grupo Grupo5 = new Grupo(7,"Juan Bottaso",Antropologia,Cesar);
 
        System.out.println(Cesar.getInfo());
        System.out.println(Antropologia.getInfo());
        System.out.println(Grupo5.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Profesor Mateo = new Profesor("Mateo Quizhpi","Electricidad",5,6);
        Asignatura Circuitos2 = new Asignatura("circuitos Electricos",140,6,"Boylestad");
        Grupo Grupo6 = new Grupo(1,"Mario Rizini",Circuitos2,Mateo);
 
        System.out.println(Mateo.getInfo());
        System.out.println(Circuitos2.getInfo());
        System.out.println(Grupo6.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
    } 
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pais;

/**
 *
 * @author esteb
 */
public class Principal {
    

     
    public static void main(String[] args) {
       Pais Ecuador = new Pais("Ecuador","Sudamerica","Guillermo lasso",24);
       
        Provincia Azuay = new Provincia("Azuay","Cuenca",12,"A",Ecuador);
        Ciudad Cuenca = new Ciudad(700000,"Deportivo Cuenca",Azuay);
        
        Provincia Guayas = new Provincia("Guayas","Guayaquil",10,"G",Ecuador);
        Ciudad Guayaquil = new Ciudad(2000000,"Barcelona",Guayas);
        
        Provincia Loja = new Provincia("Loja","Ciudad de loja",5,"L",Ecuador);
        Ciudad CiudadLoja = new Ciudad(200000,"Liga de Loja",Loja);
        
        Provincia Pichincha = new Provincia("Pichincha","Quito",7,"P",Ecuador);
        Ciudad Quito = new Ciudad(3000000,"Liga de Quito", Pichincha);
        
        Provincia Tungurahua = new Provincia("Tungurahua","Ambato",3,"T",Ecuador);
        Ciudad Ambato = new Ciudad(400000,"Mushuc-Runa", Tungurahua);
        
        Provincia Eloro = new Provincia("Eloro","Machala",4,"O",Ecuador);
        Ciudad Machala = new Ciudad(300000,"Orense", Eloro);

        System.out.println(Cuenca.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Azuay.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        System.out.println(Guayaquil.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Guayas.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------   ");
        
        System.out.println(CiudadLoja.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Loja.getInfo());
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------   ");
        
        System.out.println(Quito.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Pichincha.getInfo());
        System.out.println("-----------------------------------------------------------------------------------------------------------------------------------------------    "); 
        
        System.out.println(Ambato.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Tungurahua.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        System.out.println(Machala.getInfo());
        System.out.println(Ecuador.getInfo());
        System.out.println(Eloro.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
    }  
}

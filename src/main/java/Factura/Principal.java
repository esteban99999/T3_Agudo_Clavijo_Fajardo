/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package Factura;

/**
 *
 * @author esteb
 */
public class Principal {

    public static void main(String[] args) {
        
        Cliente Alex = new Cliente("Alex Clavijo",15,"Totoracocha",9976544);
        Producto Coca = new Producto("Coca",5,"coca cola","bebible");
        Factura Factura1 = new Factura("Electronica",2022,Coca,Alex);
        
        System.out.println(Alex.getInfo());
        System.out.println(Coca.getInfo());
        System.out.println(Factura1.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Cliente Nicolas = new Cliente("Nicolas Agudo",18,"kennedy",4564578);
        Producto Doritos = new Producto("Doritos de queso",1,"Frito-Lay","comible");
        Factura Factura2 = new Factura("Electronica",2022,Doritos,Nicolas);
        
        System.out.println(Nicolas.getInfo());
        System.out.println(Doritos.getInfo());
        System.out.println(Factura2.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Cliente Manuel = new Cliente("Manuel Fajardo",12,"Gapal",6437627);
        Producto encebollado = new Producto("encebollado",3,"ceviches de la y","comible y bebible");
        Factura Factura3 = new Factura("Electronica",2022,encebollado,Manuel);
        
        System.out.println(Manuel.getInfo());
        System.out.println(encebollado.getInfo());
        System.out.println(Factura3.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Cliente Carlos = new Cliente("Carlos Chacha",11,"3 puentes",547659857);
        Producto sanduche = new Producto("sanduche de pollo",4,"bar del tecnico","comible");
        Factura Factura4 = new Factura("Electronica",2022,sanduche,Carlos);
        
        System.out.println(Manuel.getInfo());
        System.out.println(encebollado.getInfo());
        System.out.println(Factura4.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Cliente Santiago = new Cliente("Santiago Alvarez",20,"Totora",65464218);
        Producto cuy = new Producto("cuy con papas",10,"eli","comible");
        Factura Factura5 = new Factura("Electronica",2022,cuy,Santiago);
        
        System.out.println(Manuel.getInfo());
        System.out.println(encebollado.getInfo());
        System.out.println(Factura5.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
        
        Cliente Juan = new Cliente("Juan Balarezo",18,"Los totems",621543);
        Producto ceviche = new Producto("ceviche",3,"ceviches de la y","comible y bebible");
        Factura Factura6 = new Factura("Electronica",2022,ceviche,Juan);
        
        System.out.println(Juan.getInfo());
        System.out.println(ceviche.getInfo());
        System.out.println(Factura6.getInfo());
        System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------------  ");
    }
}

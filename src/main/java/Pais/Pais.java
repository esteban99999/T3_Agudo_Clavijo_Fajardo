/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pais;

/**
 *
 * @author esteb
 */
public class Pais extends Show {
    
   private String nombrePais;
   private String continentePais;
   private String presidentePais;
   private int numeroProvincias;

    public Pais(String nP, String cP, String pP, int numP){
        
        this.nombrePais = nP;
        this.continentePais = cP;
        this.presidentePais = pP;
        this.numeroProvincias = numP;
    }

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public String getContinentePais() {
        return continentePais;
    }

    public void setContinentePais(String continentePais) {
        this.continentePais = continentePais;
    }

    public String getPresidentePais() {
        return presidentePais;
    }

    public void setPresidentePais(String presidentePais) {
        this.presidentePais = presidentePais;
    }

    public int getNumeroProvincias() {
        return numeroProvincias;
    }

    public void setNumeroProvincias(int numeroProvincias) {
        this.numeroProvincias = numeroProvincias;
    }
   public String getInfo(){
       
       return "El nombre del pais es: "+this.getNombrePais()
               +" el continente en el que se encuentra es: "+this.getContinentePais()
               +" el presidente del pais es: "+this.getPresidentePais()
               +" y el numero de provincias que contiene el pais es: "+this.getNumeroProvincias();
   }

   
  
}

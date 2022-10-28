/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pais;

/**
 *
 * @author esteb
 */
public class Provincia extends Show {
    
    private String nombreProvinicia;
    private String capitalProvincia;
    private int numeroCantones;
    private String letraPlaca;
    private Pais country;
    
    public Provincia(String nP, String cP, int nC, String lP, Pais c){
        
       this.nombreProvinicia = nP;
       this.capitalProvincia=cP;
       this.numeroCantones=nC;
       this.letraPlaca=lP;
       this.country=c;
    }

    public String getNombreProvinicia() {
        return nombreProvinicia;
    }

    public void setNombreProvinicia(String nombreProvinicia) {
        this.nombreProvinicia = nombreProvinicia;
    }

    public String getCapitalProvincia() {
        return capitalProvincia;
    }

    public void setCapitalProvincia(String capitalProvincia) {
        this.capitalProvincia = capitalProvincia;
    }

    public int getNumeroCantones() {
        return numeroCantones;
    }

    public void setNumeroCantones(int numeroCantones) {
        this.numeroCantones = numeroCantones;
    }

    public String getLetraPlaca() {
        return letraPlaca;
    }

    public void setLetraPlaca(String letraPlaca) {
        this.letraPlaca = letraPlaca;
    }

    public Pais getCountry() {
        return country;
    }

    public void setCountry(Pais country) {
        this.country = country;
    }
    
     public String getInfo() {
         
        return "El nombre de la provincia es: " + this.getNombreProvinicia()
            +" y la capital de la provincia es: "+ this.getCapitalProvincia()
            +" tambien contiene un numero de cantones de: "+this.getNumeroCantones()
            +" y la letra de la placa que caracteriza la provincia es: "+this.getLetraPlaca()
            +", El pais al que pertenece la provincia es: "+this.getCountry().getNombrePais();
                
    }
    
}

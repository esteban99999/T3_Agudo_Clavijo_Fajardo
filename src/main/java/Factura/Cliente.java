/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

/**
 *
 * @author esteb
 */
public class Cliente extends Show{
  
    private String nombreCliente;
    private int edadCliente;
    private String direccionCliente;
    private int telefonoCliente;

    public Cliente(String nC, int eC, String dC, int tC) {
        this.nombreCliente = nC;
        this.edadCliente = eC;
        this.direccionCliente = dC;
        this.telefonoCliente = tC;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getEdadCliente() {
        return edadCliente;
    }

    public void setEdadCliente(int edadCliente) {
        this.edadCliente = edadCliente;
    }

    public String getDireccionCliente() {
        return direccionCliente;
    }

    public void setDireccionCliente(String direccionCliente) {
        this.direccionCliente = direccionCliente;
    }

    public int getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(int telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }
    
    public String getInfo(){
        
        return "El nombre del cliente es: "+this.getNombreCliente()
                +", tiene una edad de: "+this.getEdadCliente()
                +", su direccion de vivienda es: "+this.getDireccionCliente()
                +", y su numero de telefono es: "+this.getTelefonoCliente();
    } 
    
    
    
}

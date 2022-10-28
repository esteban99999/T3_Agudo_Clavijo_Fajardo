/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

/**
 *
 * @author esteb
 */
public class Factura extends Show {
    
   private String tipoFactura;
   private int añoFactura;
   private Producto product;
   private Cliente client;

    public Factura(String tF, int aF, Producto p, Cliente c) {
        this.tipoFactura = tF;
        this.añoFactura = aF;
        this.product = p;
        this.client = c;
    }

    public String getTipoFactura() {
        return tipoFactura;
    }

    public void setTipoFactura(String tipoFactura) {
        this.tipoFactura = tipoFactura;
    }

    public int getAñoFactura() {
        return añoFactura;
    }

    public void setAñoFactura(int añoFactura) {
        this.añoFactura = añoFactura;
    }

    public Producto getProduct() {
        return product;
    }

    public void setProduct(Producto product) {
        this.product = product;
    }

    public Cliente getClient() {
        return client;
    }

    public void setClient(Cliente client) {
        this.client = client;
    }
    
    public String getInfo(){
        return "El tipo de factura que se emitio es: "+this.getTipoFactura()
                +", el año de la factura es: "+this.getAñoFactura()
                +", el producto que se facturo fue: "+this.getProduct().getNombreProducto()
                +" Y el nombre de la persona a la que fue la factura es: "+this.getClient().getNombreCliente();
        
    }
   
}


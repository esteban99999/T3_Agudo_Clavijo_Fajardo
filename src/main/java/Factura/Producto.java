/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factura;

/**
 *
 * @author esteb
 */
public class Producto extends Show{
    
    private String nombreProducto;
    private int costoProducto;
    private String marcaProducto;
    private String tipoProducto;

    public Producto(String nP, int cP, String mP, String tP) {
        this.nombreProducto = nP;
        this.costoProducto = cP;
        this.marcaProducto = mP;
        this.tipoProducto = tP;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(int costoProducto) {
        this.costoProducto = costoProducto;
    }

    public String getMarcaProducto() {
        return marcaProducto;
    }

    public void setMarcaProducto(String marcaProducto) {
        this.marcaProducto = marcaProducto;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }
    
    public String getInfo(){
        return "El nombre del producto que va a comprar es: "+this.getNombreProducto()
                +", el costo del producto es de: "+this.getCostoProducto()
                +", la marca del producto es: "+this.getMarcaProducto()
                +", y el tipo de producto es: "+this.getTipoProducto();
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author esteb
 */
public class Asignatura extends Show{
    private String nombreAsignatura;
    private int horasAsignatura;
    private int numeroUnidades;
    private String libroGuia; 

    public Asignatura(String nA, int hA, int nU, String lG) {
        this.nombreAsignatura = nA;
        this.horasAsignatura = hA;
        this.numeroUnidades = nU;
        this.libroGuia = lG;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getHorasAsignatura() {
        return horasAsignatura;
    }

    public void setHorasAsignatura(int horasAsignatura) {
        this.horasAsignatura = horasAsignatura;
    }

    public int getNumeroUnidades() {
        return numeroUnidades;
    }

    public void setNumeroUnidades(int numeroUnidades) {
        this.numeroUnidades = numeroUnidades;
    }

    public String getLibroGuia() {
        return libroGuia;
    }

    public void setLibroGuia(String libroGuia) {
        this.libroGuia = libroGuia;
    }
  public String getInfo(){
      return "El nombre de la asignatura es: "+this.getNombreAsignatura()
              +", las horas de la asignatura son: "+this.getHorasAsignatura()
              +", la Unidades de la asignatura son: "+this.getNumeroUnidades()
              +", El libro guia que se usa en la asignatura es: "+ this.getLibroGuia();
  }  

}

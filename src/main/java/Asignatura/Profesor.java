/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author esteb
 */
public class Profesor extends Show{
   
    private String nombreProfesor;
    private String oficinaProfesor;
    private int numeroMaterias;
    private int nivelTitulo;

    public Profesor(String nP, String oP, int nM, int nT) {
        this.nombreProfesor = nP;
        this.oficinaProfesor = oP;
        this.numeroMaterias = nM;
        this.nivelTitulo = nT;
    }

    public String getNombreProfesor() {
        return nombreProfesor;
    }

    public void setNombreProfesor(String nombreProfesor) {
        this.nombreProfesor = nombreProfesor;
    }

    public String getOficinaProfesor() {
        return oficinaProfesor;
    }

    public void setOficinaProfesor(String oficinaProfesor) {
        this.oficinaProfesor = oficinaProfesor;
    }

    public int getNumeroMaterias() {
        return numeroMaterias;
    }

    public void setNumeroMaterias(int numeroMaterias) {
        this.numeroMaterias = numeroMaterias;
    }

    public int getNivelTitulo() {
        return nivelTitulo;
    }

    public void setNivelTitulo(int nivelTitulo) {
        this.nivelTitulo = nivelTitulo;
    }
    public String getInfo(){
        
        return "El nombre del profesor es: "+this.getNombreProfesor()
                +", la oificina de materia del profesro es: "+this.getOficinaProfesor()
                +", El numero de materias del profesor es: "+this.getNumeroMaterias()
                +", El nivel de tirurlo del prpfesor es: "+this.getNivelTitulo();
    }
    
    
}

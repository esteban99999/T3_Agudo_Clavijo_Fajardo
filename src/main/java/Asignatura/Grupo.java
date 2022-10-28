/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Asignatura;

/**
 *
 * @author esteb
 */
public class Grupo {
    private int numeroGrupo;
    private String edificioClase;
    private Asignatura subject;
    private Profesor teacher;

    public Grupo(int nG, String eC, Asignatura s, Profesor t) {
        this.numeroGrupo = nG;
        this.edificioClase = eC;
        this.subject = s;
        this.teacher = t;
    }

    public int getNumeroGrupo() {
        return numeroGrupo;
    }

    public void setNumeroGrupo(int numeroGrupo) {
        this.numeroGrupo = numeroGrupo;
    }

    public String getEdificioClase() {
        return edificioClase;
    }

    public void setEdificioClase(String edificioClase) {
        this.edificioClase = edificioClase;
    }

    public Asignatura getSubject() {
        return subject;
    }

    public void setSubject(Asignatura subject) {
        this.subject = subject;
    }

    public Profesor getTeacher() {
        return teacher;
    }

    public void setTeacher(Profesor teacher) {
        this.teacher = teacher;
    }
    public String getInfo(){
        return "el numero de grupo es: "+this.getNumeroGrupo()
                +", El edificio en que se imparte la clase es: "+this.getEdificioClase()
                +", la asignatura que se imparte es: "+this.getSubject().getNombreAsignatura()
                +", El profesor que imparte la materia en el grupo es: "+this.getTeacher().getNombreProfesor();
    }
}

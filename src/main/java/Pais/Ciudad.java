/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pais;

/**
 *
 * @author esteb
 */
public class Ciudad extends Show{
    
    private  int numeroHabitantes;
    private String equipoPoupular;
    private Provincia province;
   

    public Ciudad(int nH, String eP, Provincia p) {
        this.numeroHabitantes = nH;
        this.equipoPoupular = eP;
        this.province = p;
       
    }

    public int getNumeroHabitantes() {
        return numeroHabitantes;
    }

    public void setNumeroHabitantes(int numeroHabitantes) {
        this.numeroHabitantes = numeroHabitantes;
    }

    public String getEquipoPoupular() {
        return equipoPoupular;
    }

    public void setEquipoPoupular(String equipoPoupular) {
        this.equipoPoupular = equipoPoupular;
    }

    public Provincia getProvince() {
        return province;
    }

    public void setProvince(Provincia province) {
        this.province = province;
    }
 
    public String getInfo(){
        
        return "La ciudad tiene un numero de habitantes de: "+this.getNumeroHabitantes()
                +" el equipo popular de la ciudad es: "+this.getEquipoPoupular()
                +" la ciudad pertenece a la provincia "+this.getProvince().getNombreProvinicia();
                
    }

    
}


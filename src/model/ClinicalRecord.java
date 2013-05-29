/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.code.morphia.annotations.Entity;
import com.google.code.morphia.annotations.Id;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastian
 */
@Entity
public class ClinicalRecord {
    @Id
    private Integer idHistoria;
    
    private List<Appointment> citas;

    public ClinicalRecord(){
        
    }
    
    public ClinicalRecord(int idHistoria) {
        this.idHistoria = idHistoria;
        this.citas = new ArrayList<Appointment>();
    }
    
    public ClinicalRecord(int idHistoria, List<Appointment> citas) {
        this.idHistoria = idHistoria;
        this.citas = citas;
    }
    

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public List<Appointment> getCitas() {
        return citas;
    }

    public void setCitas(List<Appointment> citas) {
        this.citas = citas;
    }
    
    public void add(Appointment appointment) {
        this.citas.add(appointment);
    }
}

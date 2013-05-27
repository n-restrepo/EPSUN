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
public class HistoriaClinica {
    @Id
    private Integer idHistoria;
    
    private List<Cita> citas;

    public HistoriaClinica(){
        
    }
    
    public HistoriaClinica(int idHistoria) {
        this.idHistoria = idHistoria;
        this.citas = new ArrayList<Cita>();
    }
    
    public HistoriaClinica(int idHistoria, List<Cita> citas) {
        this.idHistoria = idHistoria;
        this.citas = citas;
    }
    

    public int getIdHistoria() {
        return idHistoria;
    }

    public void setIdHistoria(int idHistoria) {
        this.idHistoria = idHistoria;
    }

    public List<Cita> getCitas() {
        return citas;
    }

    public void setCitas(List<Cita> citas) {
        this.citas = citas;
    }
    
    public void add(Cita appointment) {
        this.citas.add(appointment);
    }
}

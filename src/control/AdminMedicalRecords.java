/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Cita;
import model.HistoriaClinica;
import model.ProcessResult;
import model.dao.SingleDAO;

/**
 *
 * @author Silex RPR
 */
public class AdminMedicalRecords {
    
    public ProcessResult createMedicalRecord(Integer idPerson) {
        HistoriaClinica newRecord = new HistoriaClinica(idPerson);
        SingleDAO.getInstance().getHistoriaDAO().save(newRecord);
        return ProcessResult.COMPLETED;
    }
    
    public HistoriaClinica getMedicalRecord(Integer id) {
        return SingleDAO.getInstance().getHistoriaDAO().get(id);
    }
    
    public ProcessResult addAppointment(Integer id, Cita appointment) {
        HistoriaClinica record = SingleDAO.getInstance().getHistoriaDAO().get(id);
        record.add(appointment);
        return ProcessResult.COMPLETED;
    }
}

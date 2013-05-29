/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.Appointment;
import model.ClinicalRecord;
import model.ProcessResult;
import model.dao.SingleDAO;

/**
 *
 * @author Silex RPR
 */
public class AdminMedicalRecords {
    
    public ProcessResult createMedicalRecord(Integer idPerson) {
        ClinicalRecord newRecord = new ClinicalRecord(idPerson);
        SingleDAO.getInstance().getHistoriaDAO().save(newRecord);
        return ProcessResult.COMPLETED;
    }
    
    public ClinicalRecord getMedicalRecord(Integer id) {
        return SingleDAO.getInstance().getHistoriaDAO().get(id);
    }
    
    public ProcessResult addAppointment(Integer id, Appointment appointment) {
        ClinicalRecord record = SingleDAO.getInstance().getHistoriaDAO().get(id);
        record.add(appointment);
        return ProcessResult.COMPLETED;
    }
}

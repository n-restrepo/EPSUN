/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.HistoriaClinica;
import model.Persona;
import model.ProcessResult;
import model.dao.SingleDAO;

/**
 *
 * @author Silex RPR
 */
public class AdminPersons {

    public Integer createPerson(Persona person) {
        SingleDAO.getInstance().getPersonaDAO().save(person);
        return person.getIdPersona();
    }
    
    public ProcessResult createPerson(Integer id, String nombre, String apellido, String telefono,
                                      int edad) {
        Persona person = new Persona(id, nombre, apellido, telefono, edad);
        SingleDAO.getInstance().getPersonaDAO().save(person);
        return ProcessResult.COMPLETED;
    }
    
    public Persona getPerson(Integer id) {
        return SingleDAO.getInstance().getPersonaDAO().get(id);
    }
}

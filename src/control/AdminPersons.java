/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import model.ClinicalRecord;
import model.Person;
import model.ProcessResult;
import model.dao.SingleDAO;

/**
 *
 * @author Silex RPR
 */
public class AdminPersons {

    public Integer createPerson(Person person) {
        SingleDAO.getInstance().getPersonaDAO().save(person);
        return person.getIdPersona();
    }
    
    public ProcessResult createPerson(Integer id, String nombre, String apellido, String telefono,
                                      int edad) {
        Person person = new Person(id, nombre, apellido, telefono, edad);
        SingleDAO.getInstance().getPersonaDAO().save(person);
        return ProcessResult.COMPLETED;
    }
    
    public Person getPerson(Integer id) {
        return SingleDAO.getInstance().getPersonaDAO().get(id);
    }
}

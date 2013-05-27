/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import control.AdminMedicalRecords;
import control.AdminPersons;
import model.Persona;
import model.HistoriaClinica;

/**
 *
 * @author Silex RPR
 */
public class EPSUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AdminMedicalRecords adminMedicalRecords = new AdminMedicalRecords();
        AdminPersons adminPersons = new AdminPersons();
      
        adminPersons.createPerson(1, "pedro", "perez", "57123456789", 123);
        adminMedicalRecords.createMedicalRecord(1);
        
        Persona persona = adminPersons.getPerson(1);
        HistoriaClinica historia = adminMedicalRecords.getMedicalRecord(1);
        
        System.out.println(persona.getNombre()+" "+persona.getApellido()+" "+persona.getTelefono());
        System.out.println(""+historia.getIdHistoria()+" "+historia.getCitas());
        
    }
}

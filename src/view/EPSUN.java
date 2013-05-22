/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.util.ArrayList;
import model.Persona;
import model.Cita;
import model.HistoriaClinica;
import model.dao.SingleDAO;

/**
 *
 * @author Silex RPR
 */
public class EPSUN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SingleDAO singletonDAO = new SingleDAO();
        
        /*singletonDAO.getPersonaDAO().save(new Persona(1, "pedro", "perez", "57123456789", 123));
        singletonDAO.getHistoriaDAO().save(new HistoriaClinica(1,new ArrayList<Cita>()));*/
        
        Persona persona = singletonDAO.getPersonaDAO().get(1);
        HistoriaClinica historia = singletonDAO.getHistoriaDAO().get(1);
        
        System.out.println(persona.getNombre()+" "+persona.getApellido()+" "+persona.getTelefono());
        System.out.println(""+historia.getIdHistoria()+" "+historia.getCitas());
        
    }
}

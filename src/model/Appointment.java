/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.code.morphia.annotations.Id;
import java.util.Calendar;

/**
 *
 * @author Sebastian
 */
public class Appointment {
    @Id
    private int idAppointment;
    
    private int idPerson;
    private Calendar date;
    private AppointmentState state;
    private AppointmentType type;
    private String charge;
    private String observations;

    public String getCharge() {
        return charge;
    }
    
    
}

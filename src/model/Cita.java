/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.google.code.morphia.annotations.Id;

/**
 *
 * @author Sebastian
 */
public class Cita {
    @Id
    private int idCita;
    
    private int idPersona;
    private Fecha fecha;
    private Hora hora;
    private EstadoCita estado;
    private TipoCita tipo;
    private String costo;
    private String observaciones;
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view.clinicalRecords;


import View.payments.BankPayments;
import control.AdminMedicalRecords;
import model.Appointment;
import model.Payment;
import model.ProcessResult;
import model.ROb;
/**
 *
 * @author NicolasR
 * 
 * Abstract: This class provides the interface for the Hospital application to add the results from an appointment into the Patient's Clinical Record
 */
public class ClinicalRecordEntry {
    private BankPayments bankPaymentInterface;
    private AdminMedicalRecords adminMedicalRecords = new AdminMedicalRecords();
    
    
    
    public ProcessResult addClinicalRecordEntry(Integer idHospital, Integer idPersona, Appointment appointmentInformation ) //idHospital: Hospital wich calls the method
    {
        Payment appointmentPayment = new Payment();
        ROb bankPaymentResult = new ROb();
        
        appointmentPayment.setIdOwner("0001");//to define later
        appointmentPayment.setBankAccountDestination("0002"); //Destination Bank Account will be obtained from the service administrator
        appointmentPayment.setMoneyAmount(appointmentInformation.getCharge());
        
        
        bankPaymentResult = this.bankPaymentInterface.payBank(appointmentPayment);
        
        if(!bankPaymentResult.isSuccess())
        {
            System.out.println(bankPaymentResult.getErr_message());
            return ProcessResult.ERROR;
        }
       
        
        try
        {
            this.adminMedicalRecords.addAppointment(idPersona, appointmentInformation);                    
        }
        catch(Exception e)
        { return ProcessResult.ERROR;}
                
        return ProcessResult.COMPLETED;
        
    }
         
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package View.payments;

import model.Payment;
import model.ROb;

/**
 *
 * @author Silex RPR
 */
public class BankPayments {
    
    public ROb payBank(Payment payment) {
        // Send payment to Bank
        // Receive Rob
        
        ROb received = new ROb();
        received.setData(payment);
        received.setErr_message("");
        received.setSuccess(true);
        
        return received;
    }
}

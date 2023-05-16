/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coffeemahcine;

import javax.swing.JOptionPane;



/**
 *
 * @author MoMO
 */
public class OutOfBeansException extends Exception {

    public OutOfBeansException() {
    JOptionPane.showMessageDialog(null,"The machine is out of beans" ); 
    }
    public OutOfBeansException(String message){
        super(message);
    }
    
    
    
}

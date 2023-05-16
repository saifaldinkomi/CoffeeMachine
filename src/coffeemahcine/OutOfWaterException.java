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
public class OutOfWaterException extends Exception{

    public OutOfWaterException() {
         JOptionPane.showMessageDialog(null,"The machine is out of water" ); 
    }
    public OutOfWaterException(String message)
    {
        super(message);
    }
        
    
}

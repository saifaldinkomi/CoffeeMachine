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
public class FullWaterException extends Exception {
    public FullWaterException()
    {
         JOptionPane.showMessageDialog(null,"The Water is full" ); 
    }
    
}

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
public class FullBeansException extends Exception{
    public FullBeansException()
    {
        JOptionPane.showMessageDialog(null,"The machine is Full of beans" ); 
    }
    
}

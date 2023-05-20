/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemahcine;

import javax.swing.JOptionPane;



/**
 *
 * @author Saif
 */
public class CoffeMachine {
    WaterTank watertank;
    WasteTray wastetray;
    Grinder grinder;
    Counter Counter=new Counter();
  
   
    BeansContainer beans;

    public CoffeMachine() {
        
    }

    public CoffeMachine(WaterTank watertank, WasteTray wastetray, Grinder grinder,  BeansContainer beans) {
       
        this.watertank = watertank;
        this.wastetray = wastetray;
        this.grinder = grinder;
        this.beans = beans;
       
        
    }
    public void MakeCoffe(double Water,Double Beans,int Grind,String Type,String mix) throws OutOfBeansException, OutOfWaterException
    {
        if (Water<=watertank.getLevel())
        { 
        if(Beans<=beans.getLevel())
        {
            
        beans.drain(Beans);
        grinder.setLevel(Grind);
        grinder.grind(Beans);
        watertank.Drain(Water);
        Logger1.LogInfo("The Cup Of "+mix+" "+ Type+" Has Been Made\nPon Aptit");
        wastetray.add(1);
        Counter.Count();
        }else 
         throw new OutOfBeansException();
       
        }else throw new OutOfWaterException();
         
    } 
    

    
    
    
    
    
}

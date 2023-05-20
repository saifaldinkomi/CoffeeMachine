/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemahcine;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Saif
 */
public class WaterTank {
    
    private double capacity;
    private double level=0;
    

   

    public WaterTank(double capacity, int level) {
        
        this.capacity = capacity;
        this.level = level;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    
    
    public void fill(double water) throws  FullWaterException{
        if(this.level<=this.capacity)
        {
            if(water<=this.capacity-this.level)
              {level+=water;
               Logger1.LogInfo("Filling Water Tank with :"+water+" ml of water");
              }    
        else throw new FullWaterException();
        }
        else throw new FullWaterException();
    }
     public void Drain(double water) throws OutOfWaterException{
         
           if(level!=0 && water<=this.level )
            {
            level-=water;
            Logger1.LogInfo(water +" ml Of Water Has been poured");
            }
           else throw new OutOfWaterException();
                 
    }
     public double waterLevel(){
     return ((this.level/this.capacity)*100);
     }
      public String getInfo(){
            return "capacuty: " + this.capacity + "level:" + this.level;
                    }
}

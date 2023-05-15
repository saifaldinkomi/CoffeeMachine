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
public class WaterTank {
    private double capacity;
    private double level=0;

    public WaterTank() {
    }

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
    
    
    public void fill(double water){
        if(this.level<=this.capacity)
            if(water<=this.capacity-this.level)
                 level+=water;
            else JOptionPane.showMessageDialog(null, "the water amount larger then capacity");
    }
     public void drein(double water){
          if(this.level!=0)
            if(water<=this.level)
        level-=water;
            else JOptionPane.showMessageDialog(null, "the water amount smaller then level");
    }
     public double waterLevel(){
     return ((this.level/this.capacity)*100);
     }
      public String getInfo(){
            return "capacuty: " + this.capacity + "level:" + this.level;
                    }
}

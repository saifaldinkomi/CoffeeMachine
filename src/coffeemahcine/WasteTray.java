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
public class WasteTray {
    private double capacity;
    private double level;

    public WasteTray() {
    }

    public WasteTray(int capacity, int level) {
        this.capacity = capacity;
        this.level = level;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
    public void add(double amount){
        if(this.level<=this.capacity)
            if(amount<=this.capacity-this.level)
                 level+=amount;
            else JOptionPane.showMessageDialog(null, "Your Watse Tray Is Full");
    }
    public void cleen(){
        this.level=0;
    }
     public String getInfo(){
            return "capacuty: " + this.capacity + "level:" + this.level;
                    }
}

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
public class BeansContainer {
    private double capasity;
    private double level;

    public BeansContainer() {
    }

    public BeansContainer(double capasity, double level) {
        this.capasity = capasity;
        this.level = level;
    }

    public double getCapasity() {
        return capasity;
    }

    public void setCapasity(double capasity) {
        this.capasity = capasity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
    public void drain(double amount){
            if(amount<=this.level)
                this.level-=amount;
    }
     public void fill(double amount){
        if(this.level<=this.capasity)
            if(amount<=this.capasity-this.level)
                 level+=amount;
            else JOptionPane.showMessageDialog(null, "the bens conener is full");
    }
     public String getInfo(){
            return "capacuty: " + this.capasity + "level:" + this.level;
                    }
}

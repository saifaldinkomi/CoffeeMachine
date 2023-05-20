/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coffeemahcine;


/**
 *
 * @author Saif
 */
public class BeansContainer   {
    private double Capacity;
    private double level=0;

    public BeansContainer() {
    }

    public BeansContainer(double capasity, double level) {
        this.Capacity = capasity;
        this.level = level;
    }

    public double getCapasity() {
        return Capacity;
    }

    public void setCapasity(double capasity) {
        this.Capacity = capasity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }
    public void drain(double amount)throws OutOfBeansException{
            if(amount<=this.level)
            {   this.level-=amount;
            Logger1.LogInfo(amount+"Beans Has been Drained");
            
            }
            else 
                throw new OutOfBeansException();
               
            
    }
     public void fill(double amount) throws FullBeansException
     {
        if(this.level<=this.Capacity)
        {if(amount<=this.Capacity-this.level)
            { level+=amount;
            Logger1.LogInfo("Filling Beans Container With "+amount+" beans");
            }
        else throw new FullBeansException();
        }  
       else throw new FullBeansException();
                
    }
     public double BeansLevel(){
     return ((this.level/this.Capacity)*100);
     }
     public String getInfo(){
            return "capacity: " + this.Capacity + " level:" + this.level;
                    }

    
}

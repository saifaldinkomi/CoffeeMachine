package coffeemahcine;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Saif
 */
public class Grinder {
    private int level=0;

    public Grinder() {
    }

    public Grinder(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    } 
    public void grind(double amount){
        level=0;
    }
  public String getinfo(){
      return "level:"+this.level;
  }
}


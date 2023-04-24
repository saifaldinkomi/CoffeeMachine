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
public class CoffeMachine {
    WaterTank watertank;
    WasteTray wastetray;
    Grinder grinder;
    Counter counter;

    public CoffeMachine() {
    }
    

    public CoffeMachine(WaterTank watertank, WasteTray wastetray, Grinder grinder, Counter counter) {
        this.watertank = watertank;
        this.wastetray = wastetray;
        this.grinder = grinder;
        this.counter = counter;
    }
    
    
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package coffeemahcine;

import java.util.Scanner;

/**
 *
 * @author MoMO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CoffeMachine CoffeeMachine=new CoffeMachine();
        Scanner scanner = new Scanner(System.in);
          System.out.println("Please Choose The opreation you want to make :"+"\n"+
                "-------------------------------------------------------------"+"\n"+
                "1- Make Coffee"+"\n"
                +"2- refill water"+"\n"
                +"3- refill beans"+"\n"
                +"4- clear waste tray");
            System.out.println("Make your Choice : ");
            int choice;
        choice = scanner.nextInt();
            switch (choice){
                    
                        case 1:
                            System.out.println("Please Choose Your Prefered Type of Coffee\n"+"1- Esspreso\n"+"2- Americano\n");
                            int typechoice = scanner.nextInt();
                            switch (typechoice){
                                case 1:
                                    System.out.println("Would you like it \n 1- Single \n 2- Double");
                                    int schoice =scanner.nextInt();
                                    switch (schoice){
                                        case 1: CoffeeMachine.watertank.drein(30);
                                        CoffeeMachine.grinder.setLevel(7);
                                        CoffeeMachine.grinder.grind(7);
                                        CoffeeMachine.wastetray.add(1);
                                        
                                            
                                    }
                            }
                        
                        
                    }
    }
    
    
}

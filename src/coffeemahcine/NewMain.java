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
                +"4- clear waste tray\n"
                +"5- Exit");
            System.out.println("Make your Choice : ");
            int choice;
        choice = scanner.nextInt();
        while (choice!=5) {            
            boolean flag=false;
        
            switch (choice){
                       
                            case 1:
                             while(!flag){
                             System.out.println("Please Choose Your Prefered Type of Coffee\n"+"1- Esspreso\n"+"2- Americano\n");
                                int typechoice = scanner.nextInt();
                                switch (typechoice){
                                 case 1:
                                     System.out.println("Would you like it \n 1- Single \n 2- Double");
                                        int schoice =scanner.nextInt();
                                        switch (schoice){
                                           case 1: CoffeeMachine.watertank.Drain(30);
                                          CoffeeMachine.grinder.setLevel(7);
                                          CoffeeMachine.grinder.grind(7);
                                         CoffeeMachine.wastetray.add(1);
                                         break;
                                         case 2:CoffeeMachine.watertank.Drain(60);
                                          CoffeeMachine.grinder.setLevel(14);
                                         CoffeeMachine.grinder.grind(14);
                                         CoffeeMachine.wastetray.add(1);
                                         break;
                                    default:
                                        flag=true;
                                       }
                                      break;
                                case 2:
                                    System.out.println("Would you like it \n 1- Single \n 2- Double");
                                    int dchoice =scanner.nextInt();
                                    switch (dchoice){
                                        case 1: CoffeeMachine.watertank.Drain(170);
                                        CoffeeMachine.grinder.setLevel(7);
                                        CoffeeMachine.grinder.grind(7);
                                        CoffeeMachine.wastetray.add(1);
                                        break;
                                        case 2:CoffeeMachine.watertank.Drain(220);
                                        CoffeeMachine.grinder.setLevel(14);
                                        CoffeeMachine.grinder.grind(14);
                                        CoffeeMachine.wastetray.add(1);
                                        default:
                                            flag=true;
                                            
                                    }  
                                    default:
                                        flag=true;
                                }    
                            }
                             break;
                        case 2: double wt;
                             System.out.println("enter amount water:");
                            wt = scanner.nextDouble();
                            CoffeeMachine.watertank.fill(wt);
                            break;
                         case 3: double bc;
                            System.out.println("enter amount beans:");
                            bc = scanner.nextDouble();
                            CoffeeMachine.beans.fill(bc);
                            break;
                         case 4:
                            CoffeeMachine.wastetray.cleen();
                            break;
                        default:
                            System.err.println("invald choice");
                            break;
                         }            
                        
                    }
        System.err.println("Goodbye!");
    }
    
    
}

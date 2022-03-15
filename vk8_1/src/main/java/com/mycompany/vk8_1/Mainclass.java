/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk8_1;

import java.util.Scanner;

/**
 *
 * @author eevak
 */
public class Mainclass {
        public static void main(String [] args){
        //sigleton-suunnitteluperiaate eli oliosta luodaan vain 1 instanssi
            
        int input = 0;
        boolean x = true;
        
        Scanner scan = new Scanner(System.in); //luodaan scan olio
        BottleDispenser bottledispenser = BottleDispenser.getInstance(); //viittaus luokalla!
        
        while(x == true){
            
            System.out.println();
            System.out.println("*** BOTTLE DISPENSER ***");
            System.out.println("1) Add money to the machine");
            System.out.println("2) Buy a bottle");
            System.out.println("3) Take money out");
            System.out.println("4) List bottles in the dispenser");
            System.out.println("0) End");
        
            System.out.print("Your choice: ");
            input = scan.nextInt();
        
            switch(input){
                
                case 1:
                    bottledispenser.addMoney();
                    break;
                case 2:
                    bottledispenser.buyBottle();
                    break;
                case 3:
                    bottledispenser.returnMoney();
                    break;
                case 4:
                    //listaa automaatin pullot
                    bottledispenser.listBottles();
                    break;
                case 0:
                    x=false;
                    break;
                    
            }

        
        }
    
    
    
    
    }
}

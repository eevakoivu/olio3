/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk8_1;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author eevak
 */
public class BottleDispenser {
    //erilaisia pulloja, eri kokoisina ja eri hintaisina
    private static BottleDispenser bottledispenser = new BottleDispenser();
    private int bottles;
    private double money;
    private int choice;
    
    public static BottleDispenser getInstance(){ //Luodaan vain 1 bottledispenser
        return bottledispenser;
    }
    
    private ArrayList<Bottle> list = new ArrayList<Bottle>();
    
    private BottleDispenser() { //kutsutaan samassa luokassa 
        bottles = 5;
        money = 0;
        
        //lisätään pullot Arraylistiin
        list.add(new Bottle("Pepsi Max", 0.5, 1.8));
        list.add(new Bottle("Pepsi Max", 1.5, 2.2));
        list.add(new Bottle("Coca-Cola Zero", 0.5, 2.0));
        list.add(new Bottle("Coca-Cola Zero", 1.5, 2.5));
        list.add(new Bottle("Fanta Zero", 0.5, 1.95));

    }
    
    public void addMoney() {
        money += 1;
        System.out.println("Klink! Added more money!");
    }
    
    
    public void buyBottle() {
        
        listBottles();
        Scanner scan2 = new Scanner(System.in);            
        System.out.print("Your choice: ");
        choice = scan2.nextInt();
        
        if(money < list.get(choice-1).getPrice()){ //indeksit 0-4
            System.out.println("Add money first!");
        }
        else if(bottles > 0){ 
            bottles -= 1; //pullojen määrä vähenee 1
            money -= list.get(choice-1).getPrice();
            System.out.println("KACHUNK! " + list.get(choice-1).getName() + " came out of the dispenser!");
            removeObject(choice);
        }
    }
    
    public void returnMoney() {
        
        // moneyd = (double) money;
        DecimalFormat formatted = new DecimalFormat("0.00");
        System.out.println("Klink klink. Money came out! You got " + formatted.format(money) + "€ back");
        money = 0;
    }
    
    public void removeObject(int choice){
        list.remove(choice-1);
        
    }
    
    public void listBottles(){
        
        for(int i = 0;i<bottles;i++) {
     
            System.out.println(i+1 + ". Name: " + list.get(i).getName()); //viittaaminen olioon!
            System.out.println("\tSize: " + list.get(i).getSize() + "\tPrice: " + list.get(i).getPrice());
            
        }
        
    }
}

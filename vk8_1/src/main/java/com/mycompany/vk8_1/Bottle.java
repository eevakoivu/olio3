/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vk8_1;

/**
 *
 * @author eevak
 */
public class Bottle {
    private String name;
    private String manufacturer;
    private double total_energy;
    private double size;
    private double price;
    
    /*public Bottle(){ //oletusrakentaja
        /* name = "Pepsi Max";
        manufacturer = "Pepsi";
        total_energy = 0.3;
        size = 0.5;
        price = 1.8; */
    
    public Bottle(String name, double size, double price){
        this.name=name; //tallentaa nimen name-muuttujaan
        this.size=size;
        this.price=price;
    }
    
    public String getName(){
        return name;
    }
    
    public String getManufacturer(){
        return manufacturer;
    }
    
    public double getEnergy(){
        return total_energy;
    }
    
    public double getPrice(){
        return price;
    }
    
    public double getSize(){
        return size;
    }
}

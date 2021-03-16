/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gm.pcworld;

/**
 *
 * @author Adriel
 */
public class Display {
    
    private long displayId;
    private String brand;
    private static int displayCounter;
    
    
    private Display(){
        this.displayId = ++displayCounter;
    }
    
    public Display (String brand){
        this();
        this.brand = brand;
    }
    
    public String getBrand(){
        return brand;
    }
    
    public void setBrand(String brand){
        this.brand = brand;
    }
    
    @Override
    public String toString(){
        return "Display {DisplayId: " + displayId + ", Brand: " + brand;
    }
    
}

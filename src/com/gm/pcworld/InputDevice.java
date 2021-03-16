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
public class InputDevice {
    
    private String brand;
    
    public InputDevice(String brand){
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
        return "InputDivice Brand: " + brand;
    }
}

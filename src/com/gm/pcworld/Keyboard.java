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
public class Keyboard extends InputDevice{
    
    private int keyboardId;
    private static int keyboardCounter;
    
    
    public Keyboard (String brand){
        super(brand);
        this.keyboardId = ++keyboardCounter;
    }
    
}

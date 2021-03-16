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
public class Mouse extends InputDevice {
    
    private int mouseId;
    private static int mouseCounter;
    
    
    public Mouse(String brandcito){
        super(brandcito);
        this.mouseId = ++mouseCounter;
    }
}

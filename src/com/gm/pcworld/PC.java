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
public class PC {
    
    private int computerId;
    private String name;
    private Display display;
    private Mouse mouse;
    private Keyboard keyboard;
    private static int pcCounter;
    
    private PC(){
        this.computerId = ++pcCounter;
    }
    
    public PC(String name, Display display, Mouse mouse, Keyboard keyboard){
        this();
        this.name = name;
        this.display = display;
        this.mouse = mouse;
        this.keyboard = keyboard;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Display getDisplay(){
        return display;
    }
    
    public void setDisplay(Display display){
        this.display = display;
    }
    
    public Keyboard getKeyboard(){
        return keyboard;
    }
    
    public void setKeyboard(Keyboard keyboard){
        this.keyboard = keyboard;
    }
    
    public Mouse getMouse(){
        return mouse;
    }
    
    public void setMouse(Mouse mouse){
        this.mouse = mouse;
    }
    
    @Override
    public String toString(){
        return "Pc {computerId = " + computerId + ", Name = " + name + ", Display = " + display + ", Mouse = " + mouse + ", Keyboard = " + keyboard;
    }
}

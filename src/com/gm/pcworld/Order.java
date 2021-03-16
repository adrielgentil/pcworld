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
public class Order {
    
    private int orderId;
    private PC computers[];
    private static int ordersCounter;
    private int pcCounter;
    private static final int MAX_PC = 10;
    
    
    public Order(){
        this.orderId = ++ordersCounter;
        computers = new PC[MAX_PC];
    }
    
    public void addPC(PC computer){
        if (pcCounter < MAX_PC){
            computers[pcCounter++] = computer;
        }
        else{
            System.out.println("The maximum of computers has been exceeded:: "+MAX_PC);
        }
        
    }
    
    public void showPC(){
        System.out.println("Order #" + orderId);
        System.out.println("Total of computer ordered:" + pcCounter);
        System.out.println("Detail of the order:");
        for (int i=0; i<pcCounter; i++){
            System.out.println(computers[i]);
        }
    }
    
}

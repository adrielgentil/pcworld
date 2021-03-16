/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import com.gm.pcworld.*;

/**
 *
 * @author Adriel
 */
public class PcWorld {
    
    public static void main(String[] args){
        Mouse mouse1 = new Mouse("Logitech");
        Mouse mouse2 = new Mouse("Ryzen");
        Mouse mouse3 = new Mouse("Noga");
        
        Keyboard keyb1 = new Keyboard("Redragon");
        Keyboard keyb2 = new Keyboard("Corsair");
        Keyboard keyb3 = new Keyboard("Nvidia");
        
        Display dis1 = new Display("Asus");
        Display dis2 = new Display("Intel");
        Display dis3 = new Display("AMD");
        
        PC pc1 = new PC("compu1", dis1, mouse1, keyb1);
        PC pc2 = new PC("compu2", dis2, mouse2, keyb2);
        PC pc3 = new PC("compu3", dis3, mouse3, keyb3);
        
        Order order1 = new Order();
        Order order2 = new Order();
        
        
        order1.addPC(pc1);
        order1.addPC(pc2);
        order1.addPC(pc3);
        
        order2.addPC(pc1);
        order2.addPC(pc3);
        
        
        order1.showPC();
        order2.showPC();
    }
}

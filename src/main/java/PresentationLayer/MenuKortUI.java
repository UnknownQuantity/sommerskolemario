/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Pizza;
import java.util.ArrayList;

/**
 *
 * @author Jacob
 */
public class MenuKortUI {
 
    public static void visMenuKort(ArrayList<Pizza> pizzaliste){
        
        System.out.println("************MenuKort***********");
        for (Pizza pizza : pizzaliste) {
            System.out.println(pizza.getPizzaID() + ":" + pizza.getNavn());
            
        }
        
    }
    
}

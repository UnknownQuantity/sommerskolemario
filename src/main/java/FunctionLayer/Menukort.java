/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

import java.util.ArrayList;

/**
 *
 * @author Jacob
 */
public class Menukort {
    
    private static ArrayList<Pizza> pizzaliste;

    public Menukort() {
        if (pizzaliste == null) {
            try {
                
            
            pizzaliste = DataLayer.MenuMapper.getMenu();
        }
            catch (Exception ex) {
                System.out.println(ex);
            }
        }
    }
    
    
    
    public static void addPizza(Pizza pizzaItem) {
        
    }
    
}

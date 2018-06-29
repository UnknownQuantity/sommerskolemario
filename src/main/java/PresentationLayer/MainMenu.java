/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PresentationLayer;

import FunctionLayer.Ordre;
import java.util.Scanner;

/**
 *
 * @author Jacob
 */
public class MainMenu {
 
    public static void showMainMenu(){
        
        boolean afslut = false;
        

        
        Scanner console = new Scanner(System.in);
        
        while(!afslut){
        
        System.out.println("Hovedmenu: ");
        System.out.println("1. hvis menukort");
        System.out.println("5. Afslut");
        
        String inputString = console.next();
        
        switch(inputString){
            
            case"1" : visMenukort(); break;
            case"5" : afslut = true; break;
                
                                
        }
        
        }
    }
    
    
    public static void visMenukort() {
        
        try {
            MenukortUI.visMenuKort(DataLayer.MenuFacade.getMenu());
            
            
        } catch (Exception ex) {
            System.out.println("Fejl :( " + ex.getMessage());
        }
        
    }
    
    
    public static void createOrder(){
        
        Ordre nyOrdre;
        
        try {
            nyOrdre = DataLayer.OrdreFacade.createOrder(new Ordre(1140, 157, 1));
            System.out.println(nyOrdre.toString());
        }
        catch(Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
    
}

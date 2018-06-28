/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataLayer;

import FunctionLayer.Pizza;
import java.util.ArrayList;

/**
 *
 * @author Jacob
 */
public class MenuFacade {
    
    public static ArrayList <Pizza> getMenu() throws Exception {
        return MenuMapper.getMenu();
    }
    
}

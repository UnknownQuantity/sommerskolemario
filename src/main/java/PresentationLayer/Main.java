package PresentationLayer;

import FunctionLayer.Menukort;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pizzaaa");
        FunctionLayer.Menukort menu = new FunctionLayer.Menukort();
        
        try{
            
            System.out.println(DataLayer.MenuMapper.getMenu().toString());
        }
        catch (Exception ex) {
            System.out.println("der er sket en fejl :(" + ex.getMessage());
        }
    }

}

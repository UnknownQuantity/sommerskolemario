package PresentationLayer;

public class Main {

    public static void main(String[] args) {
        System.out.println("Pizzaaa");
        
        try{
            DataLayer.MenuMapper.getMenu();
        }
        catch (Exception ex) {
            System.out.println("der er sket en fejl :(" + ex.getMessage());
        }
    }

}

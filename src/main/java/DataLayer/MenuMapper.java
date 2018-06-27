package DataLayer;

import FunctionLayer.Pizza;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MenuMapper {

    public static ArrayList<Pizza> getMenu() throws Exception {
        
        ArrayList<Pizza> pizzaliste = new ArrayList();
        
        try {
            Connection con = Connector.connection();
            String SQL = "SELECT * FROM pizza";
            PreparedStatement ps = con.prepareStatement(SQL);
            ps.execute();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                
                int pizzaId = rs.getInt("pizza_id");
                int pizzaPris = rs.getInt("pris");
                String pizzaNavn = rs.getString("navn");
                String pizzaBeskrivelse = rs.getString("beskrivelse");
                
                pizzaliste.add(new Pizza(pizzaId, pizzaPris, pizzaNavn, pizzaBeskrivelse));
                
               // System.out.println("Pizza_id: " + pizzaId + ": " + pizzaNavn);
            }
            return pizzaliste;
            
        } catch (SQLException | ClassNotFoundException ex) {
            System.out.println(ex.getMessage());
            throw new Exception(ex.getMessage());
        }
    }

}

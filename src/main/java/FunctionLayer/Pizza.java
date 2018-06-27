/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FunctionLayer;

/**
 *
 * @author Jacob
 */
public class Pizza {
    
    private int pizzaID;
    private int pris;
    private String navn;
    private String beskrivelse;

    @Override
    public String toString() {
        return "Pizza{" + "pizzaID=" + pizzaID + ", pris=" + pris + ", navn=" + navn + ", beskrivelse=" + beskrivelse + '}';
    }

    public Pizza(int pizzaID, int pris, String navn, String beskrivelse) {
        this.pizzaID = pizzaID;
        this.pris = pris;
        this.navn = navn;
        this.beskrivelse = beskrivelse;
    }

    public int getPizzaID() {
        return pizzaID;
    }

    public void setPizzaID(int pizzaID) {
        this.pizzaID = pizzaID;
    }

    public int getPris() {
        return pris;
    }

    public void setPris(int pris) {
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getBeskrivelse() {
        return beskrivelse;
    }

    public void setBeskrivelse(String beskrivelse) {
        this.beskrivelse = beskrivelse;
    }
    
    
    
}

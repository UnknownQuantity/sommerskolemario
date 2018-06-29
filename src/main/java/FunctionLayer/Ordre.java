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
public class Ordre {
    
   private int ordre_id;
   private int afhentningstids;
   private int samletpris;
   private  int kunde_id;

    public Ordre(int ordre_id, int afhentningstids, int samletpris, int kunde_id) {
        this.ordre_id = ordre_id;
        this.afhentningstids = afhentningstids;
        this.samletpris = samletpris;
        this.kunde_id = kunde_id;
    }

    public Ordre(int afhentningstids, int samletpris, int kunde_id) {
        this.afhentningstids = afhentningstids;
        this.samletpris = samletpris;
        this.kunde_id = kunde_id;
    }

    
    
    public int getOrdre_id() {
        return ordre_id;
    }

    public void setOrdre_id(int ordre_id) {
        this.ordre_id = ordre_id;
    }

    public int getAfhentningstids() {
        return afhentningstids;
    }

    public void setAfhentningstids(int afhentningstids) {
        this.afhentningstids = afhentningstids;
    }

    public int getSamletpris() {
        return samletpris;
    }

    public void setSamletpris(int samletpris) {
        this.samletpris = samletpris;
    }

    public int getKunde_id() {
        return kunde_id;
    }

    public void setKunde_id(int kunde_id) {
        this.kunde_id = kunde_id;
    }
   
   
   
    
}

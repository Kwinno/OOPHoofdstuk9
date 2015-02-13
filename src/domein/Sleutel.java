/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

public class Sleutel extends Voorwerp {
    private int deur;
    private static int aantalInOmloop;

    public Sleutel(String naam, double gewicht, int niveau, int deur) {
        super(naam, gewicht, niveau);
        this.deur = deur;
        aantalInOmloop++;
    }

    public int getDeur() {
        return deur;
    }
    
     public boolean pastOp(int deur) {
        return this.deur == deur;
    }
    public void setDeur(int deur) {
        stelDeurIn(deur);
    }

    public int getAantalInOmloop() {
        return aantalInOmloop;
    }

    public void setAantalInOmloop(int aantalInOmloop) {
        this.aantalInOmloop = aantalInOmloop;
    }

    private void stelDeurIn(int deur) {
        if(deur > 0)
            this.deur = deur;
        else
            throw new IllegalArgumentException("Deur nummer moet positief zijn");
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }

    //@Override
    //protected void finalize() throws Throwable {
     //aantalInOmloop--;
    }
    
    
}

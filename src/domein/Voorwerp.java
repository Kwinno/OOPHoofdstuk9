/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;


public class Voorwerp {
    private final String naam;
    private int niveau;
    private double gewicht;

    public Voorwerp(String naam, double gewicht, int niveau) {
        this.naam = naam;
        if(niveau < 1 || niveau > 10)
            throw new IllegalArgumentException("Niveau moet tussen 1 en 10 zijn");
        if(gewicht < 0 || gewicht >= 1000)
            throw new IllegalArgumentException("Gewicht moet postief zijn en kleiner dan 1000");
    this.niveau = niveau;
    this.gewicht = gewicht;
    }
    

    public void setNiveau(int niveau) {
    if(niveau >= 1 && niveau <= 10)
        this.niveau = niveau;
        else
            throw new IllegalArgumentException("Niveau moet tussen 1 en 10 zijn");
    }    

    public void setGewicht(double gewicht) {
        if(gewicht <= 1000 && gewicht >= 0)
        this.gewicht = gewicht;
        else
            throw new IllegalArgumentException("Gewicht moet postief zijn en kleiner dan 1000");
    }

    public String getNaam() {
        return naam;
    }

    public int getNiveau() {
        return niveau;
    }

    public double getGewicht() {
        return gewicht;
    }

    @Override
    public String toString() {
        return String.format("%s %s met gewicht %.3f kg uit niveau %d",this.getClass().getSimpleName(), naam, gewicht, niveau);
    }
    
    
}

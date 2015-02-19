/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domein;

/**
 *
 * @author Ingmar
 */
public class Wapen extends Voorwerp{

    private int kracht;
    private boolean gebruikt;

    public Wapen( String naam, double gewicht, int niveau, int kracht, boolean gebruikt) {
        super(naam, gewicht, niveau);
        if(niveau > 5)
            throw new IllegalArgumentException("Niveau moet tussen 1 en 5 zijn");
        if(kracht < 0)
            throw new IllegalArgumentException("Kracht moet positief zijn");
        super.setNiveau(niveau);
        this.kracht = kracht;
        this.gebruikt = gebruikt;
    }

    public int getKracht() {
        return kracht;
    }

    public void setKracht(int kracht) {
            if(kracht >= 0)
        this.kracht = kracht;
        else
            throw new IllegalArgumentException("Kracht moet positief zijn");
    }

    public boolean isGebruikt() {
        return gebruikt;
    }

    public void setGebruikt(boolean gebruikt) {
        if(gebruikt == true)        
            this.gebruikt = gebruikt;
        else
            throw new IllegalArgumentException("Wapen is niet gebruikt");
    }



    @Override
    public String toString() {
        return super.toString() + String.format(" en met kracht %d %s gebruikt.",kracht,(gebruikt?"al":"nog niet")); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public void setNiveau(int niveau) {
      if( niveau > 5)
         throw new IllegalArgumentException("Niveau moet tussen 1 en 5 zijn");
     super.setNiveau(niveau);
      }
}

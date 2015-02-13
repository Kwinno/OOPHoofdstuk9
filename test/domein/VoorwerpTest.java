package domein;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

public class VoorwerpTest
{
    private Voorwerp vwp1, vwp2, vwp3;

    @Before
    public void before()
    {
        vwp1 = new Voorwerp("speer",150,3);
        vwp2 = new Voorwerp("deur",500,9);
        vwp3 = new Voorwerp("loper",0.25,7);
    }

    @Test
    public void geefNaamVanVoorwerp()
    {
        Assert.assertEquals("speer", vwp1.getNaam());		
    }

    @Test
    public void geefNiveauVanVoorwerp()
    {
        Assert.assertEquals(3, vwp1.getNiveau());		
    }

    @Test
    public void geefGewichtVanVoorwerp()
    {
        Assert.assertEquals(150.0, vwp1.getGewicht());		
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void geefFoutmeldingBijFoutNiveau()
    {
        vwp2.setNiveau(17);
    }

    @Test(expected = IllegalArgumentException.class)
    public void geefFoutmeldingBijFoutGewicht()
    {
        vwp2.setGewicht(-5);
    }

    @Test 
    public void geefGewijzigdNiveau()
    {
        vwp1.setNiveau(2);
        Assert.assertEquals(2, vwp1.getNiveau());		
    }
    
    @Test 
    public void geefGewijzigdGewicht()
    {
        vwp1.setGewicht(750);
        Assert.assertEquals(750.0, vwp1.getGewicht());		
    }    
    
    @Test
    public void geefOutputVanVoorwerp()
    {
        Assert.assertEquals("Voorwerp loper met gewicht 0,250 kg uit niveau 7", 
                vwp3.toString());
    }
}



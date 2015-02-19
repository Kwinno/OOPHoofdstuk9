/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import domein.Sleutel;
import domein.Wapen;


public class H9Oef1 {

    public void start() {
    Wapen w[] = new Wapen[2];
    Sleutel s[] = new Sleutel[2];
    
    w[0] = new Wapen("colt",1.5,3,6,false);
    w[1] = new Wapen("brown",0.5,1,23,true);
    s[0] = new Sleutel("voordeur",0.5,3,1);
    s[1] = new Sleutel("achterdeur",0.5,1,2);
    
    for(Wapen hetWapen : w)
        System.out.println(hetWapen);
    for(int i = 0;i<s.length;i++)
        System.out.println(s[i]);
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_crettiez;

/**
 *
 * @author benja
 */
public class Baton extends Arme {
    int Age;
    
    public Baton(String nom, int niv, int old) {
        super(nom, niv);
        if (old > 0) {
            Age = old;
        } else {
            Age = 0;
        }
    }
}


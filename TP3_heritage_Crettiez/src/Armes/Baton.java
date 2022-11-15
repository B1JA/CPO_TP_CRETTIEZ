/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author benja
 */
public class Baton extends Arme {
    int Age;
    
    public Baton(String nom, int niv, int old) {
        super(nom, niv);
        if (old >= 100) {
            Age = 99;
        } else if (old > 0) {
            Age = old;
        } else {
            Age = 0;
        }
    }
    
}


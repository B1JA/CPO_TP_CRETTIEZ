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
public class Epée extends Arme {
    int Finesse;
    
    public Epée (String nom, int niv, int fine) {
        super(nom, niv);
        if (fine >= 100) {
            Finesse = 99;
        } else if (fine > 0) {
            Finesse = fine;
        } else {
            Finesse = 0;
        }
    }
    
}

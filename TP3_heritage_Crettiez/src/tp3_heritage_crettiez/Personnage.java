/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_crettiez;

/**
 *
 * @author benja
 */
public class Personnage {
    String Nom;
    int Nivlife;
    
    public Personnage (String nom, int niv) {
        Nom = nom;
        Nivlife = niv;
    }
    
    @Override
    public String toString() {  //Méthode toString
        String retourner;
        retourner = "Nom du personnage: " +Nom + ", Niveau de vie: " +Nivlife;
        return retourner;
    }
}

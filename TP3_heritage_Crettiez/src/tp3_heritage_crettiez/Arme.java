/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_crettiez;

/**
 *
 * @author benja
 */
public class Arme {
    String Nom;
    int attack;
    public Arme (String name, int att) {
        Nom = name;
        if (att > 100) {  //Cas où le niveau d'attaque est trop élevé
            System.out.println("Niveau d'attaque maximum dépassé, niveau d'attaque ramené à 100");
            att = 100;
        } else if (att < 0) {  //Cas où le niveau d'arme est trop faible
            System.out.println("Niveau d'attaque minimum non atteint, niveau d'attaque ramené à 0");
            att = 0;
        }
        attack = att;
    }
    
    @Override
    public String toString() {  //Méthode toString
        String retourner;
        retourner = "Nom de l'arme: " +Nom + ", Niveau d'attaque: " +attack;
        return retourner;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_bieres_crettiez;

/**
 *
 * @author benja
 */
public class BouteilleBiere {
    String Nom ;
    double degreAlcool;
    String brasserie ;
    boolean ouverte ; 
    
    
    

public void lireEtiquette() {
System.out.println("Bouteille de " + Nom +" (" + degreAlcool +
 " degres) \nBrasserie : " + brasserie ) ;
 
}

public BouteilleBiere(String unNom, double unDegre, String 
uneBrasserie) {
 Nom = unNom;
 degreAlcool = unDegre;
 brasserie = uneBrasserie;
 ouverte = false;
}

public boolean Decapsuler () {
    if (ouverte == false) {
        ouverte = true;
        System.out.println("Bière ouverte");
        return true;
    } else {
        System.out.println ("Erreur : La bière est déjà ouverte");
        return false ;     
    }
}
public class uneBiere {
    
}

@Override
public String toString() {
String chaine_a_retourner;
chaine_a_retourner = Nom + " (" + degreAlcool + " degrés) Ouverte ? "; 
if (ouverte == true ) chaine_a_retourner += "oui" ;
else chaine_a_retourner += "non" ;
return chaine_a_retourner ;
}

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_crettiez;

/**
 *
 * @author benja
 */
public class Voiture {
    String Modele;
    String Marque;
    int PuissanceCV;
    
    public Voiture (String unModele, String uneMarque, int unCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unCV;
    }    
    
    @Override
    public String toString() {
        String retourner;
        retourner = "Modèle: " +Modele + ", Marque: " +Marque ;
        return retourner;
    }
}

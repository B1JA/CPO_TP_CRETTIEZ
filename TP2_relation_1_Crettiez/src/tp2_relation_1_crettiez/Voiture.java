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
    Personne Proprietaire;
    
    public Voiture (String unModele, String uneMarque, int unCV) {
        Modele = unModele;
        Marque = uneMarque;
        PuissanceCV = unCV;
        Proprietaire = null;   
    }    
    
    @Override
    public String toString() {
        String retourner;
        retourner = "Modèle: " +Modele + ", Marque: " +Marque + ", Puissance: " +PuissanceCV + "CV";
        return retourner;
    }
}

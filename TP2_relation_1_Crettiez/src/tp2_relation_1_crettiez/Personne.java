/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_relation_1_crettiez;

/**
 *
 * @author benja
 */
public class Personne {
    String Prenom;
    String Nom;
    
    public Personne (String unNom, String unPrenom) {
    Nom = unNom;
    Prenom = unPrenom;
}
    @Override
    public String toString() {
        String retourner;
        retourner = "Prénom: " +Prenom + ", Nom: " +Nom ;
        return retourner;
    }
}

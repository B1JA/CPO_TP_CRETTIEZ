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
    int nbVoitures;
    Voiture [] liste_voitures;
    
    public Personne (String unNom, String unPrenom) {
    Nom = unNom;
    Prenom = unPrenom;
    nbVoitures = 0;
    liste_voitures = new Voiture [3];   
}
    
 public boolean ajouter_voiture (Voiture ajout_dune_voiture) {   
    if (ajout_dune_voiture.Proprietaire != null){
    System.out.println("Voiture volée");
    return false;
 } else if (nbVoitures >= 3) {
         System.out.println("Le propriétaire possède déjà 3 voitures");
         return false;
         } else {
         int Tableau = nbVoitures;
         nbVoitures += 1;
         ajout_dune_voiture.Proprietaire = this;
         this.liste_voitures[Tableau] = ajout_dune_voiture;
         return true;
         }
 }
    
    @Override
    public String toString() {
        String retourner;
        retourner = "Prénom: " +Prenom + ", Nom: " +Nom ;
        return retourner;
    }
}

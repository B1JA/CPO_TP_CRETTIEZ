/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_crettiez;

/**
 *
 * @author benja
 */
public class TP2_Bieres_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool = 7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        uneBiere.lireEtiquette();
        
        BouteilleBiere type2Biere = new BouteilleBiere ();
        type2Biere.Nom = "Leffe";
        type2Biere.degreAlcool = 6.6;
        type2Biere.brasserie = "Abbaye de Leffe";
    }
}

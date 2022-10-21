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
        BouteilleBiere uneBiere = new BouteilleBiere("Cuvée de trolls", 7.0, "Dubuisson") ;
        uneBiere.lireEtiquette();
        
        BouteilleBiere type2Biere = new BouteilleBiere ("Leffe", 6.6, "Abbaye de Leffe");
        type2Biere.lireEtiquette();
    }
}

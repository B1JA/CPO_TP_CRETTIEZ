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
        
        BouteilleBiere type3Biere = new BouteilleBiere ("Bud", 5.5, "Réconfort");
        type3Biere.lireEtiquette();
        
        BouteilleBiere type4Biere = new BouteilleBiere ("Kro", 3.6, "Dégout");
        type4Biere.lireEtiquette();
        
        BouteilleBiere type5Biere = new BouteilleBiere ("Despe", 2.4, "Tequila");
        type5Biere.lireEtiquette();
        
        uneBiere.Decapsuler();
        System.out.println(uneBiere);
        
        type2Biere.Decapsuler();
        System.out.println(type2Biere);
        
        type3Biere.Decapsuler();
        System.out.println(type3Biere);
        
        type4Biere.Decapsuler();
        System.out.println(type4Biere);
        
        type5Biere.Decapsuler();
        System.out.println(type5Biere);
    }
}

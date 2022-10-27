/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_relation_1_crettiez;

/**
 *
 * @author benja
 */
public class TP2_relation_1_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Voiture uneClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture uneAutreClio = new Voiture ("Clio", "Renault", 5 ) ;
    Voiture une2008 = new Voiture ("2008", "Peugeot", 6 ) ;
    Voiture uneMicra = new Voiture ("Micra", "Nissan", 4 ) ;
    Personne bob = new Personne("Bobby", "Sixkiller");
    Personne reno = new Personne("Reno", "Raines");
    System.out.println("liste des voitures disponibles: \n"+ uneClio + "\n" + uneAutreClio + "\n" + une2008 + "\n" + uneMicra ) ;
    //Le programme s'execute et affiche sans erreurs
   
    bob.liste_voitures [0] = uneClio;
    bob.nbVoitures = 1;
    uneClio.Proprietaire = bob;
    System.out.println ("la premiere voiture de Bob est " +bob.liste_voitures[0]);
    
    une2008.Proprietaire = bob;
    bob.nbVoitures += 1;
    bob.liste_voitures [1] = une2008;
    System.out.println("La deuxième voiture de Bob est "+bob.liste_voitures[1]);
            
    
    uneMicra.Proprietaire = reno;
    uneClio.Proprietaire = reno;
    reno.nbVoitures = 2;
    reno.liste_voitures[0] = uneMicra;
    reno.liste_voitures[1] = uneClio;
    System.out.println(reno.ajouter_voiture(uneMicra));
    System.out.println(reno.ajouter_voiture(uneClio));
    
    
    une2008.Proprietaire = reno;
    reno.nbVoitures += 1;
    reno.liste_voitures [reno.nbVoitures - 1] = une2008;
    
    
    System.out.println(reno.ajouter_voiture(uneMicra));
    }
}

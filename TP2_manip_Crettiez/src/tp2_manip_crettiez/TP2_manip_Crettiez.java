/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_manip_crettiez;

/**
 *
 * @author benja
 */
public class TP2_manip_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tartiflette assiette1 = new Tartiflette(500);
        Tartiflette assiette2 = new Tartiflette (600);  //Création de 2 tartiflettes 
        Tartiflette assiette3 = assiette2;  
        
        System.out.println("nb de calories de Assiette 2 : " + assiette2.nbCalories);
       
        System.out.println("nb de calories de Assiette 3 : " + assiette3.nbCalories);
        
        //En réalité seulement 2 tartiflettes ont été créées
        //assiette2 et assiette3 référencent la même tartiflette
        
        int temp = 0;
        temp = assiette1.nbCalories;
        assiette1.nbCalories = assiette2.nbCalories;
        assiette2.nbCalories = temp;  //Echange des obejts référencés grâce à une variable temporelle
        
        //Moussaka assiette666 = assiette1;
        //Moussaka assaiette667 = new Tartiflette ();
        //Une référence objet qui annonce référencer un type d'objet ne peut pas référencer un autre qui n'a aucun rapport
        
        Moussaka tableau [] = new Moussaka [10]; //Création du tableau de 10 références
        for (int i = 0; i < 10; i++) {  
        tableau [i] = new Moussaka(i*i);  //Création de 10 objets de type Moussaka grâce à la boucle for
        }
        System.out.println(tableau[5].nbCalories); //Exemple d'un résultat obtenu
    }
    }

    


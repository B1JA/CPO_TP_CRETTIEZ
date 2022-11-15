/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp3_heritage_crettiez;
import Armes.Epée;
import Armes.Baton;
import Armes.Arme;
import java.util.*;

/**
 *
 * @author benja
 */
public class TP3_heritage_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Epée Exc = new Epée ("Excalibur", 7, 5);
        Epée Dur = new Epée ("Durandal", 4, 7);
        Baton Che = new Baton ("Chêne", 4, 5);
        Baton Cha = new Baton ("Charme", 5, 6);
        
    ArrayList<Arme> Tab = new ArrayList();
    Tab.add(Exc);
    Tab.add(Dur);
    Tab.add(Che);
    Tab.add(Cha);
    
    int taille = Tab.size();
    for (int i = 0; i < taille; i++) {
        System.out.println(Tab.get(i));
    }
    
    }
    
    
}

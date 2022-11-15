/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp3_heritage_crettiez;

/**
 *
 * @author benja
 */
public class Guerrier extends Personnage {
    boolean Horse;
    
    public Guerrier(String n, int vie, boolean a) {
        super(n, vie);
        Horse = a;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_crettiez;

/**
 *
 * @author benja
 */
public class TP2_convertisseurObjet_Crettiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Convertisseur masse = new Convertisseur ();
        System.out.println(masse);
        
    double ti = 5;
    double r;
        
    Convertisseur temp = new Convertisseur ();
    
    
r = temp.CelsiusversKelvin(ti);
    System.out.println(temp);
    System.out.println(r);
         
    
r = temp.CelsiusversFarenheit(ti);
    System.out.println(temp);
    System.out.println(r);
    
r = temp.KelvinversCelsius(ti);
    System.out.println(temp);
    System.out.println(r);
    
r = temp.KelvinversFarenheit(ti);
    System.out.println(temp);
    System.out.println(r);
    
r = temp.FarenheitversCelsius(ti);
    System.out.println(temp);
    System.out.println(r);
    
r = temp.FarenheitversKelvin(ti);
   System.out.println(temp);
   System.out.println(r);
}
}

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
        
    Convertisseur temp1 = new Convertisseur ();
    temp1.CelsiusversKelvin(ti);
    System.out.println(temp1);
         
    Convertisseur temp2 = new Convertisseur ();
    temp2.CelsiusversFarenheit(ti);
    System.out.println(temp2);
    
    Convertisseur temp3 = new Convertisseur ();
    temp3.KelvinversCelsius(ti);
    System.out.println(temp3);
    
    Convertisseur temp4 = new Convertisseur ();
    temp4.KelvinversFarenheit(ti);
    System.out.println(temp4);
    
    Convertisseur temp5 = new Convertisseur ();
    temp5.FarenheitversCelsius(ti);
    System.out.println(temp5);
    
    Convertisseur temp6 = new Convertisseur ();
    temp6.FarenheitversKelvin(ti);
    System.out.println(temp6);
   
}
}

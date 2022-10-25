/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_convertisseurobjet_crettiez;

import java.util.Scanner;

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

        Convertisseur masse = new Convertisseur();
        System.out.println(masse);

        Scanner sc;
        sc = new Scanner(System.in);

        double r;
        Convertisseur temp = new Convertisseur();
        System.out.println("Quelle est la température initiale?");
        int Ti = sc.nextInt();
        System.out.println("Que voulez vous faire? \n1) Celsius to Kelvin \n2) Celsius to Farenheit \n3) Kelvin to Celsius \n4) Kelvin to Farenheit \n5) Farenheit to Celsius \n6) Farenheit to Kelvin");
        int choix = sc.nextInt();

        if (choix == 1){
            r = temp.CelsiusversKelvin(Ti);
            System.out.println(temp);
            System.out.println(r);
        } else if (choix == 2) {
            r = temp.CelsiusversFarenheit(Ti);
            System.out.println(temp);
            System.out.println(r);
        } else if (choix == 3) {
            r = temp.KelvinversCelsius(Ti);
            System.out.println(temp);
            System.out.println(r);
        } else if (choix == 4) {
            r = temp.KelvinversFarenheit(Ti);
            System.out.println(temp);
            System.out.println(r);
        } else if (choix == 5) {
            r = temp.FarenheitversCelsius(Ti);
            System.out.println(temp);
            System.out.println(r);
        } else if (choix == 6) {
            r = temp.FarenheitversKelvin(Ti);
            System.out.println(temp);
            System.out.println(r);

        }
    }
}

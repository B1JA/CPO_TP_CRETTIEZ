/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tp2_convertisseurobjet_crettiez;

/**
 *
 * @author benja
 */
public class Convertisseur {
    int nbConversions;
    public Convertisseur () {
    nbConversions = 0 ;
}
    @Override
public String toString () {
 return "nb de conversions"+ nbConversions;
}

public double CelsiusversKelvin (double tCelsius) {
    tCelsius = tCelsius + 273.15;
    return tCelsius;
}

public double CelsiusversFarenheit (double tCelsius) {
    tCelsius = (tCelsius*1.8)+32;
    return tCelsius;
}

public double KelvinversCelsius (double tKelvin) {
    tKelvin = tKelvin - 273.15;
    return tKelvin;
}

public double KelvinversFarenheit (double tKelvin) {
    tKelvin = (tKelvin - 273.15)*1.8 +32;
    return tKelvin;
}

public double FarenheitversCelsius (double tFarenheit) {
    tFarenheit = (tFarenheit - 32)/1.8;
    return tFarenheit;
}

public double FarenheitversKelvin (double tFarenheit) {
    tFarenheit = (tFarenheit - 32)/1.8 + 273.15;
    return tFarenheit;
}
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_13;

/**
 *
 * @author Pc-Gamers
 */

import java.util.Scanner;


public class Actividad_13 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String Cadena, Cadena2;
        
        System.out.println("Ingrese una cadena");
        Cadena = entrada.nextLine();
        
        
        System.out.println("Ingrese una segunda cadena");
        Cadena2 = entrada.nextLine();
        
        
        System.out.println(Cadena.contains(Cadena2));
    }
}

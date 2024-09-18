/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_8;

/**
 *
 * @author Pc-Gamers
 */


import java.util.Scanner;
public class Actividad_8 {
  
    public static void main(String[] args) {
        Scanner Cadena = new Scanner(System.in);  
        String Cad;
        int Tamaño;
        int Contador;
        int Contador_Vocal;
        Contador_Vocal=0;
        
//-----------Ingreso de la cadena y tamaño------------------

        System.out.println("Ingrese una cadena");
        Cad = Cadena.nextLine();
        System.out.println("El tamaño de la cadena es "+Cad.length());
        
        
//-------------Cambio de vocales a "a"-----------------------

    System.out.println(Cad.replace('a', 'e'));
            
//------------------Contador de vocales----------------------

        Cad=Cad.toLowerCase();
        Tamaño=Cad.length();
        Contador=0;
        while (Contador<=Tamaño-1){
            char Posicion = Cad.charAt(Contador);

            if (Posicion == 'a'|| Posicion == 'e'|| Posicion == 'i'|| Posicion == 'o'|| Posicion == 'u' ){
                Contador_Vocal=Contador_Vocal+1;
            }
            Contador=Contador+1;
        }    
        
        System.out.println("Cantidad de vocales: " + Contador_Vocal);
        }
    }


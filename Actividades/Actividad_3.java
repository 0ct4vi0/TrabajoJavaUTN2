/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.actividad_3;

/**
 *
 * @author Pc-Gamers
 */

import java.util.Scanner;
public class Actividad_3 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
       
        double numero;
        System.out.print("Ingrese un numero de 3 digitos (100 - 999): ");
        numero = sc.nextInt();
        
       while (numero < 100 || numero > 999) {
            System.out.println("Numero invalido. Debe estar entre 100 y 999.");
            numero=sc.nextInt();
       }
            double mod_numero, trunc_numero, suma_numero;
            suma_numero = 0;
            trunc_numero = 1;
            

            while (trunc_numero > 0) {
                mod_numero = numero % 10;
                suma_numero = mod_numero + suma_numero;
                trunc_numero = Math.floor(numero / 10);
                numero = trunc_numero;
            }
                System.out.println("La suma de los di­gitos es: " + suma_numero);
            }
        }




    


package org.example;
import javax.swing.*;
import java.io.*;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//  1)
//        double num;
//        System.out.print("ingrese un numero ");
//        num = sc.nextDouble();
//
//        // Convertir el número decimal a diferentes tipos de datos
//        short valorShort = (short) num;
//        int valorInt = (int) num;
//        long valorLong = (long) num;
//        String valorString = Double.toString(num);
//        float valorFloat = (float) num;
//
//        // Mostrar los resultados de las conversiones
//        System.out.println("Número original en double: " + num);
//        System.out.println("Convertido a short: " + valorShort);
//        System.out.println("Convertido a int: " + valorInt);
//        System.out.println("Convertido a long: " + valorLong);
//        System.out.println("Convertido a String: " + valorString);
//        System.out.println("Convertido a float: " + valorFloat);
//--------------------------------------------------------------------------
// 2)   Rta:   Ocurriria un error en el porgrama y falla en la resolucion,
//             para solucionarlo haria lo siguiente:
//
//        int num;
//        do  {
//            System.out.print("ingrese un numero");
//            num = sc.nextInt();
//            if (num <=30){
//                System.out.print("elnumero ingresado esta dentro del rango");
//                break;
//            }else {
//                System.out.print("EL NUMERO INGRESADO SE EXCEDE DEL RANGO ");
//            }
//        } while (num >30);
//-----------------------------------------------------------------

        int[] num2 = new int[3];
        double numero;
        int i;
        System.out.print("Ingrese un número de 3 dígitos (100 - 999): ");
        numero = sc.nextInt();
        if (numero < 100 || numero > 999) {
            System.out.println("Número inválido. Debe estar entre 100 y 999.");
        } else {
            double mod_numero, trunc_numero, suma_numero;
            suma_numero = 0;
            trunc_numero = 1;

            while (trunc_numero > 0) {
                mod_numero = numero % 10;
                suma_numero = mod_numero + suma_numero;
                trunc_numero = Math.floor(numero / 10);
                numero = trunc_numero;
            }
            System.out.println("La suma de los dígitos es: " + suma_numero);
        }
    }
//            for (i=1;i<=4;i++) {
//                num2[i] = numero % 10;          // Último dígito
//                num2[i] = (numero / 10) % 10;   // Dígito de la decena
//                num2[i] = (numero / 100) % 10; // Dígito de la centena
//            }
//            for (i=1;i < 4;i++) {
//                int suma;
//                suma = num2[i]+ num2[i];
//            }
//        }
//            // Mostrar el resultado
//        System.out.println("La suma de los dígitos es: " + suma);

}
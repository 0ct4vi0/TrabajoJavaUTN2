package org.example;
import javax.swing.*;
import java.io.*;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//--------------------------------------------------------------------------
// 2)A- Cunado se le asigna un valor que esta fuera de rango de una variable, ocurre un desbordamiento
//  (overflow) en el codigo y reduce su valor al minimo
//        byte b = 127;
//        System.out.println("Valor del byte antes del desbordeamiento: "+ b);
//        b++;
//        System.out.println("Valor del byte despues del desbordeamiento: "+ b);

//    B- Tambien puede ocurrir se genere un error en el codigo y este no termine de compilar
//        int[] num;
//        num= new int[3];
//        for (int i=1;i<5; i++) {
//            num[i]++;
//        }
//        for (int i=1;i<5; i++){
//            System.out.println(num[i]);
//        }
//---------------------------------------------------------------------------
//  7)
//        System.out.println("ingrese una cadena de texto");
//        String txt = sc.nextLine();
//        int tamCadena = txt.length();
//        int contVocal = 0;
//        System.out.println("el tamaño de la cadena es: " + tamCadena);
//        for (int i = 0; i < tamCadena; i++) {
//            char Vocal = txt.charAt(i);
//            if (Vocal == 'a' || Vocal == 'e' || Vocal == 'i' || Vocal == 'o' || Vocal == 'u' ||
//                    Vocal == 'A' || Vocal == 'E' || Vocal == 'I' || Vocal == 'O' || Vocal == 'U') {
//                contVocal++;
//            }
//        }
//        System.out.println("La cantidad de vocales son: " + contVocal);

//------------------------------------------------------------------------------------------
//  12)
//        System.out.println("ingrese una cadena de texto");
//        String cadena = sc.nextLine();
//        String extrac1 = cadena.substring(3,4);
//        String extrac2 = cadena.substring(4,5);
//        System.out.println("las palabras susstraidas son: "+ extrac1 + " y " + extrac2);

//-------------------------------------------------------------------------------------------
//  17)
        class FuncionesPrograma{
            public static String getFechaString(Date fecha){
                SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
                return formatoFecha.format(fecha);
            }
        }
//        class Principal{
//            public static void main(String[] args) {
                Date fechaActual = new Date();
                String fechaCadena = FuncionesPrograma.getFechaString(fechaActual);
                System.out.println("La fecha actual en formato cadena es: "+fechaCadena);
//            }
    }
}



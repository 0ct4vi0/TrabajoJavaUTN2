import com.sun.source.tree.IfTree;

import java.awt.print.PrinterException;
import java.util.Scanner;
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Analicemos dos cadenas, veremos si la primera contiene a la segunda");

        System.out.println("Ingrese la primer cadena: ");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda cadena: ");
        String cadena2 = sc.nextLine();

        if(cadena1.contains(cadena2)){
            System.out.println("La primer cadena contiene: " + cadena2);

        } else
            System.out.println("La primer cadena no contiene a la segunda ");
    }
}

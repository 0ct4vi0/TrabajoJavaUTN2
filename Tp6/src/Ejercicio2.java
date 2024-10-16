import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 20 números decimales:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Ingrese el número " + (i + 1) + ": ");
            int numero = sc.nextInt();
            numeros.add(numero);
        }
        int mayor = numeros.get(0);
        int menor = numeros.get(0);

        for (int numero : numeros) {
            if (numero > mayor) {
                mayor = numero;
            }
            if (numero < menor) {
                menor = numero;
            }
        }
        int rango = mayor - menor;
        System.out.println("El mayor de los números es: " + mayor);
        System.out.println("El menor de los números es: " + menor);
        System.out.println("El rango de los números es: " + rango);
    }
}

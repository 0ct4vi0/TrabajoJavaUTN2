import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese 20 numeros decimales ");
        double [] vector = new double[20];

        for (int i = 0; i < 20; i++) {
            System.out.println("Numero "+ (i+1)+ ":");
            vector[i] = sc.nextDouble();
            }
        double mayor = vector[0];
        for (int i = 0; i < 20; i++) {
            if (vector[i] > mayor) ;
            mayor = vector[i];
        }
        double menor = vector[0];
        for (int i = 0; i < 20; i++) {
            if (vector[i] < menor) {
                menor = vector[i];
            }
        }
        System.out.println("El mayor es: "+mayor+"\nEl menor es: "+menor);
        double rango = mayor - menor;
        System.out.println("El rango de los elementos en el arreglo es: " + rango);
        }

}

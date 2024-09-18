import java.util.Scanner;
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] v1 = new int [10];
        System.out.println("Llenemos el vector (Tamaño de 10)");
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + ": ");
            v1[i] = sc.nextInt();
        }
        System.out.println("Nuestro vector es el siguiente:");
        System.out.print("[");
        for (int i = 0; i < v1.length; i++) {
            if (i < v1.length - 1) {
                System.out.print(v1[i] + ",");
            } else {
                System.out.print(v1[i]);
            }
        }
        System.out.println("]");
        System.out.print("¿Que instancia desea eliminar?");
        int eliminar = sc.nextInt();

        int contador = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] == eliminar) {
                contador++;
            }
        }
        int[] v2 = new int[v1.length - contador];
        int indice = 0;
        for (int i = 0; i < v1.length; i++) {
            if (v1[i] != eliminar) {
                v2[indice] = v1[i];
                indice++;
            }
        }
        System.out.println("El nuevo vector es:");
        System.out.print("[");
        for (int i = 0; i < v2.length; i++) {
        }
        for (int i = 0; i < v2.length; i++) {
            if (i < v2.length - 1) {
                System.out.print(v2[i] + ",");
            } else {
                System.out.print(v2[i]);
            }
        }
        System.out.println("]");

    }
}

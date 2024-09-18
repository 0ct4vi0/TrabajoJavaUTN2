import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a llenar 2 vectores");
        double[] v1 = new double[5];
        double[] v2 = new double[10];
        double[] v3 = new double[5];
        System.out.println("Llenemos el primer vector (Tamaño de 5)");
        for (int i = 0; i < v1.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + ": ");
            v1[i] = sc.nextDouble();
        }
        System.out.println("Llenemos el segundo vector (Tamaño de 10)");
        for (int i = 0; i < v2.length; i++) {
            System.out.println("Ingrese el valor " + (i+1) + ": ");
            v2[i] = sc.nextDouble();
        }
        for (int i = 0; i < v1.length; i++) {
            int suma = 0;
            for (int j = 0; j < v2.length; j++) {
                suma += v1[i] * v2[j];
            }
            v3[i] = suma;
        }
        System.out.println("Estos seran nuestros vectores");
        System.out.println("El primer vector es:");
        System.out.print("[");
        for (int i = 0; i < v1.length; i++) {
            if (i < v1.length - 1) {
                System.out.print(v1[i] + ",");
            } else {
                System.out.print(v1[i]);
            }
        }
        System.out.println("]");
        System.out.println("El segundo vector es:");
        System.out.print("[");
        for (int i = 0; i < v2.length; i++) {
            if (i < v2.length - 1) {
                System.out.print(v2[i] + ",");
            } else {
                System.out.print(v2[i]);
            }
        }
        System.out.println("]");
        System.out.println("El tercer vector es:");
        System.out.print("[");
        for (int i = 0; i < v3.length; i++) {
            if (i < v3.length - 1) {
                System.out.print(v3[i] + ",");
            } else {
                System.out.print(v3[i]);
            }
        }
        System.out.println("]");


    }

}

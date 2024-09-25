import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor o igual a 3 y menor o igual que 10");
        int X = sc.nextInt();
        if (X <= 10) {
            if (X >= 3) {
                System.out.println("Numero aceptado");
                System.out.println("Llenemos el array");
                int v1 [][] = new int[X][X];
                for (int i = 0; i < X; i++) {
                    for (int j = 0; j < X; j++) {
                        System.out.print("Posicion: " + i + ", " + j + ": ");
                        v1[i][j] = sc.nextInt();
                    }
                }
                System.out.println("Nuestro vector");
                for (int i = 0; i < v1.length; i++) {
                    for (int j = 0; j < v1[i].length; j++) {
                        System.out.print(v1[i][j] + " ");
                    }
                    System.out.println();
                }

                int vectorSumas[]=new int[X];
                for (int j = 0; j < X; j++) {
                    int sumas = 0;
                    for (int i = 0; i < X; i++) {
                        sumas += v1[i][j];

                    }
                    vectorSumas[j]=sumas;
                }
                System.out.println("Resultado de sumar las columnnas");
                for (int i = 0; i < vectorSumas.length; i++) {

                    System.out.print(vectorSumas[i] + " ");
                }
                System.out.println();

            }else {
                System.out.println("El numero es menor que 3");

            }
        }else {
            System.out.println("El numero es menor que 10");
        }

    }
}

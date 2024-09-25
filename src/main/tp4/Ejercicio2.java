import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Porfavor ingrese dos numeros enteros");
        System.out.print("Nro. 1: ");
        int x = sc.nextInt();
        System.out.print("Nro. 2: ");
        int y = sc.nextInt();

        int[][] array1 = new int[x][y];
        //llenando x array1
        System.out.println("Ingrese " + x + " numeros para el primer array");
        for (int i = 0; i < x; i++) {
            System.out.print("Nro. " + (i + 1) + ":");
            array1[i][0] = sc.nextInt();
        }
        //llenando y array1
        System.out.println("Ingrese " + y + " numeros");
        for (int i = 0; i < y; i++) {
            System.out.print("Nro. " + (i + 1) + ":");
            array1[0][i] = sc.nextInt();
        }

        //ARRAY2


        int[][] array2 = new int[y][x];
        //llenando y array1
        System.out.println("Ingrese " + y + " numeros para el segundo array");
        for (int i = 0; i < y; i++) {
            System.out.print("Nro. " + (i + 1) + ":");
            array2[i][0] = sc.nextInt();
        }
        //llenando x array1
        System.out.println("Ingrese " + x + " numeros");
        for (int i = 0; i < x; i++) {
            System.out.print("Nro. " + (i + 1) + ":");
            array2[0][i] = sc.nextInt();
        }

        //ARRAY3

        int[][] array3M = new int[x][y];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                array3M[i][j] = 0;
                for (int k = 0; k < y; k++) { //
                    array3M[i][j] += array1[i][k] * array2[k][j];
                }
            }
        }

        //mostrar arrays

        System.out.println("Primer array:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array1[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar el segundo array
        System.out.println("Segundo array:");
        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(array2[i][j] + " ");
            }
            System.out.println();
        }

        // Mostrar el resultado de la multiplicación
        System.out.println("Resultado de la multiplicación:");
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                System.out.print(array3M[i][j] + " ");
            }
            System.out.println();
        }

    }
}
//se me quemo la cabeza perdon
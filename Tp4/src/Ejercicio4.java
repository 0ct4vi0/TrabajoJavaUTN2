import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero mayor o igual a 4 y menor o igual que 10");
        int X = sc.nextInt();
        boolean matrizLlena = false;
        boolean salida = false;

        while(!salida){
            if (X <= 10 && X >= 4) {
                System.out.println("Numero aceptado");
                int[][] v1 = new int[X][X];
                System.out.println("Que desea hacer?");
                System.out.println("a. LLenar la matriz \n b. Sumar los numeros de una fila \n c. Sumar los numeros de una columna \n d. sumar los numeros de la diagonali principal ");
                System.out.println("e. Sumar los numeros de la diagonal inversa \n f. Sacar la media de todos los numeros de la matriz \n g. Cerrar el programa ");
                String opcion = sc.nextLine();
                String x = opcion.toLowerCase();
                switch (x) {
                    case "a": {
                        System.out.println("Llenemos la matriz");
                        for (int i = 0; i < X; i++) {
                            for (int j = 0; j < X; j++) {
                                System.out.print("Posicion: " + i + ", " + j + ": ");
                                v1[i][j] = sc.nextInt();
                                matrizLlena = true;
                            }
                        }
                        break;
                    }
                    case "b": {
                        if (matrizLlena) {
                            System.out.println("Ingrese el número de la fila a sumar: ");
                            int i= sc.nextInt();
                            int suma = 0;
                            for (int j = 0; j < X; j++) {
                                suma += v1[i][j];
                            }
                            System.out.println("La suma de la fila " + i + " es: " + suma);
                        } else {
                            System.out.println("Debes rellenar la matriz primero.");
                        }
                        break;
                    }
                    case "c": {
                        if (matrizLlena) {
                            System.out.println("Ingrese el número de la columna a sumar: ");
                            int j= sc.nextInt();
                            int suma = 0;
                            for (int i = 0; i < X; i++) {
                                suma += v1[i][j];
                            }
                            System.out.println("La suma de la fila " + j + " es: " + suma);
                        } else {
                            System.out.println("Debes rellenar la matriz primero.");
                        }
                        break;
                    }
                    case "d": {
                        if (matrizLlena) {
                            int suma = 0;
                            for (int i = 0; i < X; i++) {
                                suma += v1[i][i];
                            }
                            System.out.println("La suma de la diagonal principal es: " + suma);
                        } else {
                            System.out.println("Debes rellenar la matriz primero.");
                        }
                        break;
                    }
                    case "e": {
                        if (matrizLlena) {
                            int suma = 0;
                            for (int i = 0; i < X; i++) {
                                suma += v1[i][X-1-i];
                            }
                            System.out.println("La suma de la diagonal inversa es: " + suma);
                        } else {
                            System.out.println("Debes rellenar la matriz primero.");
                        }
                        break;
                    }
                    case "f": {
                        if (matrizLlena) {
                            int suma = 0;
                            int total = X * X;
                            for (int i = 0; i < X; i++) {
                                for (int j = 0; j < X; j++) {
                                    suma += v1[i][j];
                                }
                            }
                            double media = (double) suma / total;
                            System.out.println("La media de todos los valores de la matriz es: " + media);
                        } else {
                            System.out.println("Debes rellenar la matriz primero.");
                        }
                        break;
                    }
                    case "g":{
                        salida = true;
                        break;
                    }
                    default: {
                        System.out.println("Opcion no valida");
                        break;
                    }
                }
            }else{
                System.out.println("El numero no es valido");
            }
        }
    }
}

import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena de numeros separada por guiones: ");
        String n = sc.nextLine();
        String [] nStr = n.split("-");
        int suma = 0;
        int contador = 0;

        System.out.println("Vector Principal: ");
        System.out.print("[");
        for (int i = 0; i < nStr.length; i++) {
            if (i < nStr.length - 1) {
                System.out.print(nStr[i] + ",");
            } else {
                System.out.print(nStr[i]);
            }
        }
        System.out.println("]");

        for (int i = 0; i < nStr.length; i++) {
            suma += Integer.parseInt(nStr[i]);
            contador++;
        }
        double promedio = suma / contador;
        System.out.println("El promedio es: " + promedio);
        System.out.println("La suma total es: " + suma);

    }
}

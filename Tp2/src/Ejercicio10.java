import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la frase o palabra: ");
        String cadena = sc.nextLine();
        System.out.println("Elija una opcion \n1.Mayusculas \n2.Minusculas");
        int opcion = sc.nextInt();

        switch (opcion) {

            case 1: {
                cadena = cadena.toUpperCase();
                System.out.println(cadena);
                break;
            }
            case 2: {
                cadena = cadena.toLowerCase();
                System.out.println(cadena);
                break;
            }
        }
    }
}

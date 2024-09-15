import java.util.Scanner;
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese dos palabras iguales");
        System.out.println("Ingrese la primer palabra: ");
        String cadena1 = sc.nextLine();
        System.out.println("Ingrese la segunda palabra: ");
        String cadena2 = sc.nextLine();

        if (cadena1.equals(cadena2)){
            System.out.println("Son iguales");
        }else
            System.out.println("No son iguales, revise las mayusculas");
    }
}

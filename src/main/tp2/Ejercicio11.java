import java.util.Scanner;

public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("A continuacion ingrese dos palabras para verificar si son iguales: ");
        System.out.print("Ingrese la primera palabra: ");

        String palabraUno = sc.nextLine();

        System.out.print("Ingrese la segunda palabra: ");

        String palabraDos = sc.nextLine();

        if (palabraUno.equals(palabraDos)){
            System.out.println("Las palabras ingresadas son iguales. (Usando .equals)");
        }else {
                System.out.println("Las palabras ingresadas NO son iguales. (Usando .equals)");
            }

        ////

        int compareStrings = palabraUno.compareTo(palabraDos);
        if (compareStrings != 0){
            System.out.println("Las palabras ingresadas NO son iguales. (Usando .compareTo)");
        }else {
            System.out.println("Las palabras ingresadas son iguales. (Usando .compareTo)");
        }

        ////

        int compareStringsNoCase = palabraUno.compareToIgnoreCase(palabraDos);
        if (compareStringsNoCase != 0){
            System.out.println("Las palabras ingresadas NO son iguales. (Usando .compareToIgnoreCase)");
        }else{
            System.out.println("Las palabras ingresadas son iguales. (Usando .compareToIgnoreCase)");
        }
    }
}

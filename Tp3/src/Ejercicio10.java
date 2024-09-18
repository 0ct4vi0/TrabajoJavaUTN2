import java.util.Scanner;
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su numero de DNI: ");
        int dni = sc.nextInt();
        int num = dni % 23;
        char []letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        System.out.println("El DNI con su letra correspondiente es: " + dni + letras[num]);
    }
}

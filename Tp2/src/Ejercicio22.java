import java.util.Scanner;
public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero: ");
        int num = sc.nextInt();
        if (num == 0){
            System.out.println("Resultado: "+num);
        }else {
            int suma = sumarDigitos(num);
            System.out.println("La suma de sus digitos es" +suma);
        }
    }
    public static int sumarDigitos(int num) {
        if (num < 10) {
            return num;
        }
        return num % 10 + sumarDigitos(num / 10);
    }
}

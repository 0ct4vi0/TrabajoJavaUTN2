import java.util.Scanner;

public class Ejercicio21 {
    public static void main(String[] args){
        Scanner sc = new  Scanner(System.in);
        System.out.println("Ingrese un numero entero mayor a 0 (CERO): ");
        int num = sc.nextInt();

        if(num >= 1){
            int resultado = sumarEnteros(num);
            System.out.println("La suma con recursion del numero ingresado es: " + resultado);
        }else{
            System.out.print("Numero ingresado no es mayor a 0 (CERO)");
        }
    }

    public static int sumarEnteros(int number){
        int suma = 0;
        if (number > 1) {
            return number + sumarEnteros(number - 1);
        } else if (number == 1) {
            return 1;
        }
        return suma;
    }
}

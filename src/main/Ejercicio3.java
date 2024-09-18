import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero de 3 digitos: ");
        int numIngresado = sc.nextInt();

        if(numIngresado >=100 && numIngresado <= 999  ){
            int resultado = 0;
            int digito1 = numIngresado % 10;
            int digito2 = (numIngresado / 10) % 10;
            int digito3 = numIngresado / 100;
            resultado = digito1 + digito2 + digito3;
            System.out.println("La suma de los tres digitos es: " + resultado);
        } else{
            System.out.println("El numero ingresado no es de 3 (tres) digitos.");
        }

    }
}

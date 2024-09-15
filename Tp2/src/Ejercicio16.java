import java.util.Scanner;

public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Double Obj = sc.nextDouble(); // Ingresamos un Double


        if (Obj != null) {  // Verificar si doubleObj es null antes de unboxing
            double Primitivo = Obj; //Se transforma a double
            System.out.println("Valor de doublePrim: " + Primitivo);
        } else {
            System.out.println("doubleObj es null");
        }
    }
}

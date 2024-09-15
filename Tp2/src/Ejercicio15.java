import java.util.Scanner;
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // int num = null; Es incompatible ya que no se puede convertir a entero (Error de compilacion)

        // En cambio podemos usar Interger
        Integer num = null; // Al ser un objeto se le puede asignar el valor null

        System.out.println(num);
    }
}

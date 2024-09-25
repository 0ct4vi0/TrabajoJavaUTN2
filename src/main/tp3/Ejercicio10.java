import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su dni (solo numeros): ");
        int dniUser= sc.nextInt();
        letraG.obtenerLetra(dniUser);
    }
    public class letraG{
        public static void obtenerLetra(int numeroDNI){
            int resto=0;
            resto =numeroDNI % 23;

            char []letras = {'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};

            System.out.println("Dni completo: "+numeroDNI+letras[resto]);
        }
    }
}

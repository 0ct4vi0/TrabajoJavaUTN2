import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese numeros separados por guiones medio (-)");
        String entradaUsuario = sc.nextLine();
        String []array = entradaUsuario.split("-");
        int totalSuma=0;
        for(int i=0;i< array.length;i++){
            totalSuma += Integer.parseInt(array[i]);
        }
        System.out.println("Suma de los numeros ingresados: "+totalSuma);
        float promedio=0;
        promedio = totalSuma / array.length;
        System.out.println("Valor promedio: "+promedio);
    }
}

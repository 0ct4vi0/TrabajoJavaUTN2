public class Ejercicio1 {
    public static void main(String[] args) {
        //Usamos el ejemplo del profesor
       int [] vector1 = new int [5];

       for (int i = 0; i <= 5; i++) {
           System.out.println(vector1[i]); //Este for nos lleva mas alla de la capacidad de nuestro array

       }
       //Como resultado tendremos el error de compilacion "java.lang.ArrayIndexOutOfBoundsException"

    }
}

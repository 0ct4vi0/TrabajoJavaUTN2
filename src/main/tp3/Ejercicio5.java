public class Ejercicio5 {
    public static void main(String[] args){
        int []array = new int[20];
        for(int i=0; i < array.length;i++){
            array[i] = (int)(Math.random()*100);
        }
        int suma=0;
        int promedio=0;

        for(int i=0;i<array.length; i++){
            suma += array[i];
            promedio = suma / array.length;
        }
        System.out.println("El promedio aritmetico es de: "+ promedio);

        int contadorIgualProm=0;
        for(int i=0; i<array.length; i++){
            if(array[i] == promedio){
                contadorIgualProm += 1;
            }
        }
        System.out.println("Cuántos de los números son iguales al promedio aritmético?");
        System.out.println("Rta: "+ contadorIgualProm);

        int contadorMayorProm=0;
        for(int i=0; i<array.length; i++){
            if(array[i] > promedio){
                contadorMayorProm += 1;
            }
        }
        System.out.println("Cuántos de los números son mayores que el promedio aritmético?");
        System.out.println("Rta: "+ contadorMayorProm);

        int contadorMenorProm=0;
        for(int i=0; i<array.length; i++){
            if(array[i] < promedio){
                contadorMenorProm += 1;
            }
        }
        System.out.println("Cuántos de los números son menores que el promedio aritmético?");
        System.out.println("Rta: "+ contadorMenorProm);
    }
}
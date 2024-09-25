import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] Args){
        System.out.println("Ingrese un numero decimal");
        Scanner sc = new Scanner(System.in);
        double doble = sc.nextDouble();

        Leon leon = new Leon();
        leon.cShort(doble);
        Serpiente serpiente =new Serpiente();
        serpiente.cInt(doble);
        TeTocaAVos teTocaAVos = new TeTocaAVos();
        teTocaAVos.cLong(doble);
        Elefante elefante = new Elefante();
        elefante.cString(doble);
        Jirafa jirafa = new Jirafa();
        jirafa.cFloat(doble);
    }
}
class Leon {
     public void cShort(double doble) {
         short dobleConvertidoShort = (short) doble ;
         System.out.println("Convertido a short: "+dobleConvertidoShort);
    }
}
class Serpiente {
    public void cInt(double doble){
        int dobleConvertidoAInt = (int) doble;
        System.out.println("Double convertido a int: "+ dobleConvertidoAInt);
    }
}
class TeTocaAVos{
    public void cLong(double doble){
        long dobleConvertidoALong = (long) doble;
        System.out.println("Double convertido a long: "+dobleConvertidoALong);
    }
}
class Elefante {
    public void cString(double doble){
        String convertidoAString = Double.toString (doble);
        System.out.println("Double convertido a String: "+convertidoAString);
    }
}
class Jirafa{
    public void cFloat(double doble){
        float convertidoAFloat = (float) doble;
        System.out.println("Double convertido a Float: "+convertidoAFloat);
    }
}
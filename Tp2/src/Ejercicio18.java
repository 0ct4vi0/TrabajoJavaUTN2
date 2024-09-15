import java.text.SimpleDateFormat;
import java.util.Date;

public class Ejercicio18 {
    public static void main(String[] args) {
        Date dia = new Date();
        System.out.println("El dia es: \n" + dia);

        String fechaCadena = fechaACadena(dia);
        System.out.println("En formato fecha se ve como: \n" + fechaCadena);

    }

    public static String fechaACadena(Date dia) {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return formato.format(dia);
    }
}
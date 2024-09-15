import java.text.SimpleDateFormat;
import java.util.Date;
public class Ejercicio17 {
    public static void main(String[] args) {
        Date dia = new Date();
        System.out.println("El dia es: "+dia);

        String fechaCadena = fechaACadena(dia);
        System.out.println("En formato fecha se ve como: "+fechaCadena);

    }
    public static String fechaACadena(Date dia) {
        SimpleDateFormat formato = new SimpleDateFormat("dd");
        return formato.format(dia);
    }
}

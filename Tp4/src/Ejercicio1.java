public class Ejercicio1 {
    public static void main(String[] args) {
        String paises [][] = new String[4][4];
        paises[0][0] = "Argentina";paises[0][1] = "Buenos Aires";paises[0][2] = "Cordoba";paises[0][3] = "La Plata";

        paises[1][0] = "España";paises[1][1] = "Madrid";paises[1][2] = "Lugo";paises[1][3] = "Sevilla";

        paises[2][0]= "Francia";paises[2][1] = "Paris";paises[2][2] = "Niza";paises[2][3] = "Lyon";

        paises[3][0]= "Italia";paises[3][1] = "Roma";paises[3][2] = "Napoles";paises[3][3] = "Sicilia";

        for (int i = 0; i < paises.length; i++) {
            System.out.println(paises[i][0] + ":");
            for (int j = 1; j < 4; j++) {
                if (j==3){
                    System.out.println( paises[i][j]);
                }else
                     System.out.print(paises[i][j]+" - ");
            }
        }
    }
}

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String [][]pyc=new String[4][4];
        System.out.println("Ingrese 4 paises:");
        for(int i=0;i<pyc.length;i++){
            System.out.print("nro "+ (i+1) +" = ");
            pyc[i][0]=sc.nextLine();
        }

        for(int i=0;i< 4;i++){
            System.out.println("ingrese 3 ciudades de " + pyc[i][0]);
            for (int j = 1; j <4; j++) {
                pyc[i][j]=sc.nextLine();
            }
        }

        //mostrar los paises con sus ciudades ingresadas:
        /*for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.println("Pais: "+pyc[j][0]+"     Ciudades: "+pyc[0][j]+pyc[0][j]+pyc[0][j]);
            }
        }
         */
        System.out.println("Pais: "+pyc[0][0]+"     Ciudad: "+pyc[0][1]+", "+pyc[0][2]+", "+pyc[0][3]);
        System.out.println("Pais: "+pyc[1][0]+"     Ciudad: "+pyc[1][1]+", "+pyc[1][2]+", "+pyc[1][3]);
        System.out.println("Pais: "+pyc[2][0]+"     Ciudad: "+pyc[2][1]+", "+pyc[2][2]+", "+pyc[2][3]);
        System.out.println("Pais: "+pyc[3][0]+"     Ciudad: "+pyc[3][1]+", "+pyc[3][2]+", "+pyc[3][3]);
    }
}

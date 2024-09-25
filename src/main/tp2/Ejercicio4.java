import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el monto de la compra: ");
        double montoCompra = sc.nextDouble();
        Gato gato = new Gato();
        gato.cajaAssistant(montoCompra);

    }
}
class Gato {
    public void cajaAssistant(double numIngresado){
        double billetes200 = 0;
        double billetes100= 0;
        double billetes50= 0;
        double billetes20= 0;
        double billetes10=0;
        double billetes5=0;
        double billetes2=0;
        double billetes1=0;
        double monedas0050=0;
        double monedas0025=0;
        double monedas0010=0;
        double monedas0005=0;
        if(numIngresado >= 200){
            while(numIngresado >= 200) {
                billetes200 = billetes200 + 1;
                numIngresado = numIngresado - 200;
            }
        }
        if(numIngresado >= 100) {
            while(numIngresado >= 100) {
                billetes100 = billetes100 + 1;
                numIngresado = numIngresado - 100;
            }
        }
        if(numIngresado >= 50){
            while(numIngresado >= 50) {
                billetes50 = billetes50 + 1;
                numIngresado = numIngresado - 50;
            }
        }
        if(numIngresado >= 20){
            while(numIngresado >= 20) {
                billetes20 = billetes20 + 1;
                numIngresado = numIngresado - 20;
            }
        }
        if(numIngresado >= 10){
            while(numIngresado >= 10) {
                billetes10 = billetes10 + 1;
                numIngresado = numIngresado - 10;
            }
        }
        if(numIngresado >= 5){
            while(numIngresado >= 5) {
                billetes5 = billetes5 + 1;
                numIngresado = numIngresado - 5;
            }
        }
        if(numIngresado >= 2){
            while(numIngresado >= 2) {
                billetes2 = billetes2 + 1;
                numIngresado = numIngresado - 2;
            }
        }
        if(numIngresado >= 1){
            while(numIngresado >= 1) {
                billetes1 = billetes1 + 1;
                numIngresado = numIngresado - 1;
            }
        }
        if(numIngresado >= 0.50){
            while(numIngresado >= 0.50) {
                monedas0050 = monedas0050 + 1;
                numIngresado = numIngresado - 0.50;
            }
        }
        if(numIngresado >= 0.25){
            while(numIngresado >= 0.25) {
                monedas0025 = monedas0025 + 1;
                numIngresado = numIngresado - 0.25;
            }
        }
        if (numIngresado >= 0.10) {
            while(numIngresado >= 0.10) {
                monedas0010 = monedas0010 + 1;
                numIngresado = numIngresado - 0.10;
            }
        }
        if (numIngresado >= 0.05) {
            while(numIngresado >= 0.05) {
                monedas0005 = monedas0005 + 1;
                numIngresado = numIngresado - 0.05;
            }
        }
        System.out.print("Se necesita lo siguiente: "+billetes200+" billetes de 200$, "+billetes100 +" billetes de 100$, " +billetes50+" billetes de 50$, "+billetes20+" billetes de 20$, "+billetes10+" billetes de 10$, "+billetes5+" billetes de 5, "+billetes2+" billetes de 2$, "+billetes1+" billetes de 1$,"+monedas0050+" monedas de 0.50$, "+monedas0025+" monedas de 0.25$, "+monedas0010+" monedas de 0.10$ y "+monedas0005+" monedas de 0.05$");
        //mejorar el print
    }

}

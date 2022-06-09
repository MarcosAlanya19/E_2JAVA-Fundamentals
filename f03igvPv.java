import java.text.DecimalFormat;
import java.util.Scanner;
public class f03igvPv {
    //function S / N
    public static void main(String[] args) {
        boolean retry;
        do {
            f03igvPv.userIgvPv();
            retry= aFunction.toTryAgain();
        }while(retry);
        System.out.println("Fin del programa");
    }
    //Dado el valor de venta de un producto, hallar eiiGV (19 %) y el precio de venta.
    public static void userIgvPv(){
        Scanner pro3=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Cuanto es el valor de venta?");
        double vVenta = pro3.nextDouble();
        double igv=vVenta*0.18;

        System.out.println("El igv es igual a "+df.format(igv));
        System.out.println("El precio de venta es igual a "+df.format((igv+vVenta)));
    }
}

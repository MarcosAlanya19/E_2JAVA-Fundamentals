import java.text.DecimalFormat;
import java.util.Scanner;

public class f05raizN {
    //function S / N
    public static void main(String[] args) {
        boolean retry;
        do {
            f05raizN.userRaizN();
            retry=aFunction.toTryAgain();
        }while (retry);
        System.out.println("Fin del programa");
    }
    //Hallar la radica ción de !l[a , donde <<a» y «n>> pertenecen a z• (números enteros positivos).
    public static void userRaizN(){
        Scanner pro5=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Escribe numero dentro dentro de la raiz");
        int a= pro5.nextInt();

        System.out.println("Introduce el valor de la raiz");
        int n= pro5.nextInt();

        double r = Math.pow(a, (double)1/(n));

        System.out.println("El resultado es "+df.format(r));

    }
}

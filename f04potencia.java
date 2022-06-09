import java.text.DecimalFormat;
import java.util.Scanner;
public class f04potencia {
    //function S / N
    public static void main(String[] args) {
        boolean retry;
        do {
            f04potencia.userPotencia();
            retry = aFunction.toTryAgain();
        }while (retry);
        System.out.println("Fin del programa");
    }
    //Hallar la potencia de a", donde <<a>> y <<n» pertenecen a z• (números enteros positivos).
    public static void userPotencia(){
        Scanner pro4=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingrese numero");
        int a= pro4.nextInt();

        System.out.println("Ingrese potencia");
        int n= pro4.nextInt();

        System.out.println("El numero "+a+" elevado a "+n+" es igual a "+ df.format(Math.pow(a,n)));
    }
}

import java.util.Scanner;

public class fp02definirEnteros {
    //Dado dos números enteros, determinar cuántos números enteros están incluidos en ellos.
    public static void useDefinirEnteros() {
        Scanner prop2=new Scanner(System.in);

        System.out.println("Ingresa inicio");
        int n1 = prop2.nextInt();

        System.out.println("Ingresa fin");
        int n2= prop2.nextInt();

        int r= n1-n2+1;

        System.out.println("Entre "+n1+" y "+n2+" hay "+(-r)+" cifras");
    }

    public static void main(String[] args) {
        boolean retry;
        do {
            fp02definirEnteros.useDefinirEnteros();
            retry=aFunction.toTryAgain();
        }while(retry);
        System.out.println("Fin del proceso");
    }
}

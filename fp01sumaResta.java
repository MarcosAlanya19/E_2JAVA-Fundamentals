import java.util.Scanner;

public class fp01sumaResta {
    //Dado dos números enteros (Z), a y b, hallar a + by a- b.
    public static void useSumaResta(){
        Scanner prop1=new Scanner(System.in);
        System.out.println("Escribe primer valor");
        int n1= prop1.nextInt();

        System.out.println("Escribe segundo valor");
        int n2= prop1.nextInt();

        int s=n1+n2;
        int r=n1-n2;

        System.out.println("El resultado de la suma es "+s);
        System.out.println("El resultado de la resta es "+r);
    }
    public static boolean useRetry(){
        Scanner retr=new Scanner(System.in);
        System.out.println("\nDesea repetir la operacion");
        System.out.println("S / N");
        String response= retr.next();

        return (response.equalsIgnoreCase("S"));
    }

    public static void main(String[] args) {
        boolean retry;
        do {
            fp01sumaResta.useSumaResta();
            retry=fp01sumaResta.useRetry();
        }while(retry);
        System.out.println("Fin del proceso");
    }
}

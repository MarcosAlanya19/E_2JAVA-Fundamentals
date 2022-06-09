import java.util.Scanner;

public class f07sumaForm {
    //Determinar la suma de los N primeros números enteros positivos (z•¡. Use la siguiente
    //fórmula.
    public static void main(String[] args) {
        boolean retry;
        do {
            f07sumaForm.useSumaForm();
            retry=f07sumaForm.useRetry();
        }while(retry);
        System.out.println("Fin del proceso");
    }
    public static void useSumaForm(){
        Scanner pro7=new Scanner(System.in);

        System.out.println("Ingresa valor de N");
        int n1= pro7.nextInt();
        int r=(n1*(n1+1))/2;
        System.out.println("El resultado es "+r);
    }
    public static boolean useRetry(){
        Scanner ret=new Scanner(System.in);
        System.out.println("\nDesear repetir la operacion?");
        System.out.println("S / N");
        String response= ret.next();

        return (response.equalsIgnoreCase("S"));
    }
}
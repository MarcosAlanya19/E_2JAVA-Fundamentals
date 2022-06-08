import java.util.Scanner;

public class aFunction {
    //bucle para preguntar si desea reintentar
    public static boolean toTryAgain() {
        System.out.println("Desea volver a intentarlo");
        System.out.println("S / N");
        Scanner value = new Scanner(System.in);
        String response = value.next();
        return (response.equalsIgnoreCase("S"));
    }
}

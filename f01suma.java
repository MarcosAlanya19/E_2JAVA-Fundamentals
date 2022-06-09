import java.util.Scanner;

public class f01suma {
    public static void main(String[] args) {
        boolean retry;
        do {
            f01suma.userSuma();
            retry = aFunction.toTryAgain();
        } while (retry);
        System.out.println("FIN DEL PROGRAMA");
    }

    public static void userSuma(){

        Scanner pro1=new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int n1 = pro1.nextInt();

        System.out.println("Ingrese segundo numero");
        int n2 = pro1.nextInt();

        //resultado de la suma
        System.out.println("El resultado de la suma es " + (n1 + n2));

    }
}

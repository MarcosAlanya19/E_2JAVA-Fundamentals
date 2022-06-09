import java.util.Scanner;
public class f02cocienteResiduo {
    //function S / N
    public static void main(String[] args) {
        boolean retry;
        do {
            f02cocienteResiduo.userCocienteResiduo();
            retry = aFunction.toTryAgain();
        } while (retry);
        System.out.println("FIN DEL PROGRAMA");
    }
    //Hallar el cociente y el residuo (resto) de dos números enteros
    public static void userCocienteResiduo(){

        Scanner pro2=new Scanner(System.in);
        System.out.println("Ingrese primer numero");
        int n1 = pro2.nextInt();

        System.out.println("Ingrese segundo numero");
        int n2 = pro2.nextInt();

        //resultado de la suma
        System.out.println("El resultado de la division es "+(n1/n2)+
                " y su residuo es "+(n1%n2));

    }
}

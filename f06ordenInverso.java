import java.util.Scanner;

public class f06ordenInverso {
    //function S / N
    public static void main(String[] args) {
        boolean retry;
        do {
            f06ordenInverso.userOrdenInverso();
            retry = aFunction.toTryAgain();
        }while(retry);
        System.out.println("Fin del programa");
    }
    //Dado un número de S dígitos, devolver el número en orden inverso.
    public static void userOrdenInverso(){
        Scanner pro6=new Scanner(System.in);

        System.out.println("Ingresa numeor de 5 digitos");
        int num = pro6.nextInt();
        int residuo;
        int invertido=0;

        while (num > 0 ) {
            residuo = num % 10;
            invertido = invertido * 10 + residuo;
            num /= 10;
        }
        System.out.println(invertido);
    }
}

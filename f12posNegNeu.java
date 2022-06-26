import java.util.Scanner;

public class f12posNegNeu {
    //Determinar si un número entero es positivo, negativo o neutro.
    public static void main(String[] args) {
        Scanner pro12=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1= pro12.nextInt();

        if (n1==0){
            System.out.println("El numero "+n1+" es neutro");
        } else if (n1>0) {
            System.out.println("El numero "+n1+" es positivo");
        }else {
            System.out.println("El numero "+n1+" es negativo");
        }
    }
}

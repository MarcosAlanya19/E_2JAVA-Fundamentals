import java.util.Scanner;

public class f15parImpar {
//Determinar si un número entero es par o impar.
public static void main(String[] args) {
    Scanner pro15=new Scanner(System.in);
    System.out.println("Ingresa un numero");
    int n1= pro15.nextInt();

    if (n1%2==0){
        System.out.println("El num "+n1+" es par");
    }else {
        System.out.println("El num "+n1+" es impar");
    }
}
}

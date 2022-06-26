import java.util.Scanner;

public class f17dobleTriple {
    //Dado un número, devolver el doble si el número
    // no es par, caso contrario el triple.
    public static void main(String[] args) {
        Scanner pro17=new Scanner(System.in);
        System.out.println("Ingresa un numero");
        int n1= pro17.nextInt();

        if (n1%2==0){
            System.out.println("El num "+n1+" es par, el triple es "+(n1*3));
        }else {
            System.out.println("El num "+n1+" es impar , el doble es "+(n1*2));
        }
    }
}


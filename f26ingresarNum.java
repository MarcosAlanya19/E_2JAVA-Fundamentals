import java.util.Scanner;

public class f26ingresarNum {
    //Al ingresar un número entre 1 y 4 devolver la estación del año de acuerdo a la siguiente tabla
    public static void main(String[] args) {
        Scanner pro26=new Scanner(System.in);
        System.out.println("Ingresar num del 1 al 4");
        int n1= pro26.nextInt();

        switch (n1) {
            case 1 -> System.out.println("Verano");
            case 2 -> System.out.println("Otoño");
            case 3 -> System.out.println("Invierno");
            case 4 -> System.out.println("Primavera");
            default -> System.out.println("Ingresar un numero del 1 al 4");
        }
    }
}

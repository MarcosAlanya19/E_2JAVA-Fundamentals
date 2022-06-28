import java.util.Scanner;

public class f30mesEstacion {
    //Al ingresar el número de un mes, devolver la estación del año de acuerdo a la siguiente tabla.
    //Mes Estación
    public static void main(String[] args) {
        Scanner pro30=new Scanner(System.in);
        System.out.println("Ingresa numero de mes");
        int mes= pro30.nextInt();

        switch (mes){
            case 1,2,3 -> System.out.println("Verano");
            case 4,5,6 -> System.out.println("Otoño");
            case 7,8,9 -> System.out.println("Invierno");
            case 10,11,12 -> System.out.println("Primavera");
            default -> System.out.println("Ingresar un mes valido del 1-12");
        }
    }
}

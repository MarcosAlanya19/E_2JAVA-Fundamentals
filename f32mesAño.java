import java.util.Scanner;

public class f32mesAño {
    //Al ingresar el día y el número de un mes, devolver la estación del año de acuerdo a la
    // siguiente tabla.
    public static void main(String[] args) {
        Scanner pro32 = new Scanner(System.in);
        System.out.println("Ingresar dia del mes");
        int diaMes = pro32.nextInt();
        System.out.println("Ingresar numero de mes");
        int mes = pro32.nextInt();

        switch (mes) {
            case 1, 2, 3 -> {
                System.out.println("Verano");
                if (mes == 3 && diaMes > 20) {
                    System.out.println("Otoño");
                }
            }
            case 4, 5, 6 -> {
                System.out.println("Otoño");
                if (mes == 6 && diaMes > 21) {
                    System.out.println("Invierno");
                }
            }
            case 7, 8, 9 -> {
                System.out.println("Invierno");
                if (mes == 9 && diaMes > 22) {
                    System.out.println("Primavera");
                }
            }
            case 10, 11, 12 -> {
                System.out.println("Primavera");
                if (mes == 12 && diaMes > 20) {
                    System.out.println("Verano");
                }
            }
        }
    }
}
import java.util.Scanner;

public class f35mesAño {
    //Dado el número del mes y el año (cuatro dígitos) de una fecha, determinar en letras qué mes
    //es y cuántos días tiene. Considerar que feb rero tiene 28 o 29 días si el año es bisiesto,
    // un año es bisiesto si es múltiplo de 4, pero no de 100, y si de 400.
    public static void main(String[] args) {
        Scanner pro35=new Scanner(System.in);
        System.out.println("Ingresar numero del mes");
        int m = pro35.nextInt();

        System.out.println("Ingresar año en 4 digitos");
        int a= pro35.nextInt();

        int d=0;
        String m1="";

        switch (m) {
            case 1 -> {
                d = 31;
                m1 = "Enero";
            }
            case 2 -> {
                if (a % 4 == 0 && (a % 100 != 0 && a % 400 == 0)) {
                    d = 29;
                } else {
                    d = 28;
                }
                m1 = "Febrero";
            }
            case 3 -> {
                d = 31;
                m1 = "Marzo";
            }
            case 4 -> {
                d = 30;
                m1 = "Abril";
            }
            case 5 -> {
                d = 31;
                m1 = "Mayo";
            }
            case 6 -> {
                d = 31;
                m1 = "Junio";
            }
            case 7 -> {
                d = 31;
                m1 = "Julio";
            }
            case 8 -> {
                d = 31;
                m1 = "Agosto";
            }
            case 9 -> {
                d = 30;
                m1 = "Septiembre";
            }
            case 10 -> {
                d = 31;
                m1 = "Octubre";
            }
            case 11 -> {
                d = 30;
                m1 = "Noviembre";
            }
            case 12 -> {
                d = 31;
                m1 = "Diciembre";
            }
        }
        System.out.println("Mes: "+ m1);
        System.out.println("Dias: "+d);
    }

}

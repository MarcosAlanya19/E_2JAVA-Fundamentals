import java.util.Scanner;

public class f37algoritPuntaje {
    //Diseñe un algoritmo que califique el puntaje obtenido en el lanzamiento de tres dados en
    //base a la cantidad de seis obtenidos, de acuerdo a lo siguiente:
    public static void main(String[] args) {
        Scanner pro37=new Scanner(System.in);
        System.out.println("Dado 1");
        int d1= pro37.nextInt();
        System.out.println("Dado 2");
        int d2= pro37.nextInt();
        System.out.println("Dado 3");
        int d3= pro37.nextInt();

        if (d1==6&&d2==6&&d3==6){
            System.out.println("Premio: ORO");
        } else if ((d1==6&&d2==6)||(d1==6&&d3==6)||(d2==6&&d3==6)) {
            System.out.println("Premio: Plata");
        } else if ((d1==6)||(d2==6)||(d3==6)) {
            System.out.println("Premio: Bronce");
        }else {
            System.out.println("Usted perdio");
        }
    }
}

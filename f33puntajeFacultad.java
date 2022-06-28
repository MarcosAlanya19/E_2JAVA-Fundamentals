import java.util.Scanner;

public class f33puntajeFacultad {
    //En una universidad se ha establecido los siguientes puntajes de ingreso para sus respectivas
    //facultades:
    public static void main(String[] args) {
        Scanner pro33=new Scanner(System.in);
        System.out.println("Ingresar puntaje obtenido");
        int puntaje= pro33.nextInt();

        if(puntaje<=70&&puntaje>0){
            System.out.println("Administracion es la facultad alcanzada");
        } else if (puntaje<=80&&puntaje>0) {
            System.out.println("Industrial es la facultad alcanzada");
        } else if (puntaje<=90&&puntaje>0) {
            System.out.println("Electronica es la facultad alcanzada");
        } else if (puntaje<=100&&puntaje>0) {
            System.out.println("Sistemas es la facultad alcanzada");
        } else {
            System.out.println("No se alcanzo ninguna facultad");
        }
    }
}

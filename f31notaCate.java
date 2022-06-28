import java.util.Scanner;

public class f31notaCate {
    //Dado la nota promedio de un alumno, obtener la categoría, según la siguiente tabla.
    public static void main(String[] args) {
        Scanner pro31=new Scanner(System.in);
        System.out.println("Ingresar promedio de alumno 0-20");
        int prom= pro31.nextInt();

        if (prom<=5 && prom>0){
            System.out.println("Pesimo");
        } else if (prom<=10&& prom>0) {
            System.out.println("Malo");
        } else if (prom<=14&& prom>0) {
            System.out.println("Regular");
        }else if (prom<=17&& prom>0) {
            System.out.println("Bueno");
        }else if (prom<=20&& prom>0) {
            System.out.println("Excelente");
        }else {
            System.out.println("Ingresar un promedio entre 0 - 20");
        }
    }
}

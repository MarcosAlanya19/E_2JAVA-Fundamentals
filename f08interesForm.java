import java.text.DecimalFormat;
import java.util.Scanner;

public class f08interesForm {
    //Calcular el interés compuesto generado por un capital depositado durante cierta cantidad de
    //tiempo, a una tasa de interés determinada; aplique las siguientes fórmulas:
    public static void useInteresForm(){
        Scanner pro8=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");

        System.out.println("Ingrese el capital");
        double c= pro8.nextDouble();

        System.out.println("Ingrese interes tasa de interes");
        double r= pro8.nextDouble();

        System.out.println("Ingrese el tiempo");
        double t= pro8.nextDouble();

        double m=Math.pow((1+r/100),t)*c;
        double i=m-c;

        System.out.println("El interes por el prestamo seria de "+df.format(i));
    }
    public static boolean useRetry(){
        Scanner retr=new Scanner(System.in);

        System.out.println("Desea repetir la operacion?");
        System.out.println("S / N");
        String response= retr.next();
        return (response.equalsIgnoreCase("s"));
    }

    public static void main(String[] args) {
        boolean retry;
        do {
            f08interesForm.useInteresForm();
            retry=f08interesForm.useRetry();
        }while(retry);
        System.out.println("Fin del proceso");
    }
}

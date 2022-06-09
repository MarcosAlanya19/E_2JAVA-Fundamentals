import java.text.DecimalFormat;
import java.util.Scanner;

public class fp08FahrengeitCK {
    //Convertir una cantidad de grados Fahrenheit a Celsius y Kelvin.
    public static void main(String[] args) {
        Scanner prop8=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.##");
        System.out.println("Ingresar grados Fahrenheit");
        double f= prop8.nextDouble();

        double c=(f-32)/1.8;
        double k=c+273.15;

        System.out.println(df.format(f)+" F es equivalente a "+df.format(c)
                +" C y "+df.format(k)+ " K");
    }
}

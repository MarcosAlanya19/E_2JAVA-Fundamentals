import java.text.DecimalFormat;
import java.util.Scanner;

public class fp10sexagesimalesCentesimales {
    //Convertir grados sexagesimales a centesimales.
    public static void main(String[] args) {
        Scanner prop10=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.###");
        System.out.println("Ingresar sexagesimales");
        double sexa= prop10.nextDouble();

        double cent= (sexa*200)/180;

        System.out.println(df.format(sexa)+" sexagesimales equivalen a "+df.format(cent)+" " +
                "centesimales");
    }

}

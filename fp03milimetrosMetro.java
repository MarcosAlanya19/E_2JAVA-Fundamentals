import java.text.DecimalFormat;
import java.util.Scanner;

public class fp03milimetrosMetro {
    //Dada una cantidad de milímet ros, expresarlo en la máxima cantidad de metros, el resto en
    //decímetros, centímetros y milímet ros.
    public static void useMilimetrosMetro(){
        Scanner prop3=new Scanner(System.in);
        DecimalFormat df=new DecimalFormat("###.###");
        System.out.println("Introduce milimetros");
        double mi= prop3.nextDouble();

        double cm=mi/10;
        double dm=cm/10;
        double m=dm/10;

        System.out.println("Los milimetros son "+df.format(mi));
        System.out.println("Expresado a centimetros "+df.format(cm));
        System.out.println("Expresado a deciemtros "+df.format(dm));
        System.out.println("Expresado a metros "+df.format(m));
    }
    public static void main(String[] args) {
        boolean retry;
        do {
            fp03milimetrosMetro.useMilimetrosMetro();
            retry=aFunction.toTryAgain();
        }while(retry);
        System.out.println("Fin del proceso");
    }
}

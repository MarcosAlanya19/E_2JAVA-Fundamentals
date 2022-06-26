import java.util.Scanner;

public class f25hms {
    //Dado la hora, minuto y segundo, encuentre la hora del siguiente segundo.
    public static void main(String[] args) {
        Scanner pro25 = new Scanner(System.in);
        System.out.print("Hora:");
        int h = pro25.nextInt();
        System.out.print("Minuto:");
        int m = pro25.nextInt();
        System.out.print("Segundo:");
        int s = pro25.nextInt();

        s += 1 ;
        if (s == 60) {
            s = 0 ;
            m += 1 ;
            if(m == 60){
                m = 0;
                h += 1 ;
                if(h == 24) {
                    h = 0;
                }
            }
        }
        System . out . println("Hora: "+h);
        System . out . println("Minuto: "+m);
        System . out . println("Segundo: "+s);
    }
}
import java.util.Scanner;

public class f23algoritmoPG {
    //Elabore un algoritmo que resuelva una ecuación de primer grado.
    public static void main(String[] args) {
        Scanner pro23=new Scanner(System.in);

        System.out.println("Ingrese (a)");
        float a= pro23.nextFloat();
        System.out.println("Ingresa (b)");
        float b= pro23.nextFloat();
        double x;

        if (a!= 0){
            x= -b/a;
            System.out.println("x: " + x);
        }else {
            x=0;
            System.out.println("x: " + x);
        }
    }
}

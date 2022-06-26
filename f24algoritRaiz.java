import java.util.Scanner;

public class f24algoritRaiz {
    //Elabore un algoritmo que obtenga las raíces reales de una ecuación de segundo grado.
    public static void main(String[] args) {
        Scanner pro24=new Scanner(System.in);

        System.out.println("Ingrese (a)");
        float a= pro24.nextFloat();
        System.out.println("Ingresa (b)");
        float b= pro24.nextFloat();
        System.out.println("Ingresa (c)");
        float c= pro24.nextFloat();
        double sg= Math . pow(b,2.0)-4*a*c;
        double x1,x2;

        if (a!= 0&&sg>=0){
            x1= -b+(sg)/(2*a);
            x2= -b-(sg)/(2*a);
        }else {
            x1 = 0;
            x2 = 0;
        }
        System.out.println("x1: "+x1);
        System.out.println("x2: "+x2);
    }
}

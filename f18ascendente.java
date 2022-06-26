import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class f18ascendente {
    //Dados 3 números, devolver los números en orden ascendente.
    public static void main(String[] args) {
        Scanner pro18=new Scanner(System.in);
        System.out.println("Ingresa n1");
        int n1= pro18.nextInt();
        System.out.println("Ingresa n2");
        int n2= pro18.nextInt();
        System.out.println("Ingresa n3");
        int n3= pro18.nextInt();

        int[]arrayAscendente={n1,n2,n3};
        Arrays.sort(arrayAscendente);

        for (int n : arrayAscendente) {
            System.out.println(n);
        }
    }
}

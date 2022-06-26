import java.util.Scanner;

public class f14multiplo {
    //Determinar si un número es múltiplo de 3 y 5.
    public static void main(String[] args) {
        Scanner pro14=new Scanner(System.in);
        System.out.println("Ingresa numero");
        int n1= pro14.nextInt();
        if (n1%3==0&&n1%5==0){
            System.out.println(n1+" es multiplo de 3 y 5");
        } else{
            System.out.println(n1+" no es multiplo de 3 y 5");
        }
    }
}

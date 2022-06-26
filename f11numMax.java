import java.util.Scanner;

public class f11numMax {
    //Dado dos números enteros diferentes, devolver el número mayor.
    public static void main(String[] args) {
        Scanner pro11=new Scanner(System.in);
        System.out.println("Ingresa num1");
        int n1= pro11.nextInt();
        System.out.println("Ingresa num2");
        int n2= pro11.nextInt();

        if(n1<n2){
            System.out.println(n2+" es mayor a "+n1);
        }else {
            System.out.println(n1+" es mayor a "+n2);
        }
    }
}

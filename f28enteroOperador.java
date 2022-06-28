import java.util.Scanner;

public class f28enteroOperador {
    //Dados dos números enteros y un operador (+, ·, • y /), devolver la operación de los dos
    //números según el operador ingresado. Considere que si el segundo número es cero y el
    // operador es<</>>,
    //no es divisible con el primer número, entonces devolver como resultado <<O>>.
    public static void main(String[] args) {
        Scanner pro28=new Scanner(System.in);
        System.out.println("Ingresar n1");
        int n1= pro28.nextInt();
        System.out.println("Ingresar n2");
        int n2= pro28.nextInt();
        System.out.println("Elija operador (+) (-) (*) (/)");
        char operador= pro28.next().charAt(0);

        switch (operador){
            case  '+'-> System.out.println(n1+n2);
            case  '-'-> System.out.println(n1-n2);
            case  '/'-> {
                if (n2==0) {
                    System.out.println(0);
                }else {
                    System.out.println(n1/n2);
                }
            }
            case  '*'-> System.out.println(n1*n2);
            default -> System.out.println("Ingresar datos validos");
        }
    }
}

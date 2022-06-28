import java.util.Scanner;

public class f27devolverLetra {
    //Dado un número entero de un dígito (O al 9), devolver el número en letras.
    public static void main(String[] args) {
        Scanner pro27=new Scanner(System.in);
        System.out.println("Ingresar numero a transformar");
        int n1= pro27.nextInt();

        switch (n1){
            case 0 -> System.out.println("Cero");
            case 1 -> System.out.println("Uno");
            case 2 -> System.out.println("Dos");
            case 3 -> System.out.println("Tres");
            case 4 -> System.out.println("Cuatro");
            case 5 -> System.out.println("Cinco");
            case 6 -> System.out.println("Seis");
            case 7 -> System.out.println("Siete");
            case 8 -> System.out.println("Ocho");
            case 9 -> System.out.println("Nueve");
            default -> System.out.println("Ingresar un numero del 0 - 9");

        }
    }
}

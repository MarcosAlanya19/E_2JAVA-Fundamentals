import java.util.Scanner;

public class f34pagarExamen {
    //Determine el importe a pagar para el examen de admisión de una universidad, cuyo valor
    //depende del nivel socioeconómico y el colegio de procedencia.
    public static void main(String[] args) {
        Scanner pro34=new Scanner(System.in);
        System.out.println("Ingrese su nivel socieconomico (A)(B)(C)");
        String nE= pro34.nextLine();
        System.out.println("Mencione si proviene de un colegio (P) o (N)");
        String colegio= pro34.nextLine();

        if (nE.equalsIgnoreCase("a")) {
            if (colegio.equalsIgnoreCase("n")){
            System.out.println("El importe a pagar seria de 300");}
            if (colegio.equalsIgnoreCase("p")) {
                System.out.println("El importe a pagar seria de 400");
            }
        }else if (nE.equalsIgnoreCase("b")) {
            if (colegio.equalsIgnoreCase("n")){
                System.out.println("El importe a pagar seria de 200");}
            if (colegio.equalsIgnoreCase("p")) {
                System.out.println("El importe a pagar seria de 300");
            }
        } else if (nE.equalsIgnoreCase("c")) {
            if (colegio.equalsIgnoreCase("n")) {
                System.out.println("El importe a pagar seria de 100");
            }
            if (colegio.equalsIgnoreCase("p")) {
                System.out.println("El importe a pagar seria de 200");
            }
        }
    }
}

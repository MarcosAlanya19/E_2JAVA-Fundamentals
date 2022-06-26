import java.util.Objects;
import java.util.Scanner;

public class f22tiposCliente {
    //Un negocio tiene dos tipos de cliente: cliente general(G)
    //y cliente afiliado(A). Acepta dos formas de pago: al contado (C)
    // y en plazos(P). Nos piden crear un programa que al ingresar el monto
    //de la compra se obtenga  el monto del descuento o el monto del recargo
    //y el total a pagar, segun la siguiente tabla
    public static void main(String[] args) {
        Scanner pro22=new Scanner(System.in);

        System.out.println("Eres cliente (A) o (G)");
        String cliente= pro22.nextLine();
        System.out.println("Forma de pago al (C) o (P)");
        String pago= pro22.nextLine();
        System.out.println("Ingresa el monto de compra");
        double n1= pro22.nextInt();

        double cG=n1*0.15;
        double cA=n1*0.20;

        double pG=n1*0.10;
        double pA=n1*0.05;

        if (cliente.equalsIgnoreCase("a")){
            if (pago.equalsIgnoreCase("c")){
                System.out.println("Su descuento al contado es " +cA+" teniendo que pagar un " +
                        "total de "+ (n1-cA));
            } else if (pago.equalsIgnoreCase("p")) {
                System.out.println("Su recargo a plazos es " +pA+" teniendo que pagar un " +
                        "total de "+ (n1+pA));
            }
        }else if (cliente.equalsIgnoreCase("g")){
            if (pago.equalsIgnoreCase("c")){
                System.out.println("Su descuento al contado es " +cG+" teniendo que pagar un " +
                        "total de "+ (n1-cG));
            } else if (pago.equalsIgnoreCase("p")) {
                System.out.println("Su recargo a plazos es " +pG+" teniendo que pagar un " +
                        "total de "+ (n1+pG));
            }
        }
    }
}

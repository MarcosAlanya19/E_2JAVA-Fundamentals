import java.util.Scanner;

public class f19restaurantDescuento {
    //Un restaurante ofrece un descuento del 10 % para consumos de hasta S/.100.00 y un
    //descuento de 20% para consumos mayores. Para ambos casos se aplica un impuesto del19 %.
    // Determinar
    //el monto del descuento, el impuesto y el importe a pagar.

    public static void main(String[] args) {
        Scanner pro19=new Scanner(System.in);

        System.out.println("Ingresa el monto de tu consumo");
        int consumo= pro19.nextInt();

        double dsct=consumo*0.10;
        double dsct2=consumo*0.20;
        double imp19=consumo*0.19;

        if (consumo<=100&&consumo>0){
            System.out.println("Su descuento es de "+dsct);
            System.out.println("Su impuesto es de "+imp19);
            System.out.println("Su total a pagar es "+(consumo-dsct+imp19));
        }else {
            System.out.println("Su descuento es de "+dsct2);
            System.out.println("Su impuesto es de "+imp19);
            System.out.println("Su total a pagar es "+(consumo-dsct2+imp19));
        }
    }
}

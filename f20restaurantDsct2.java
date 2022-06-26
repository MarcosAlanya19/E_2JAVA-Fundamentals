import java.util.Scanner;

public class f20restaurantDsct2 {
    //Debido a los excelentes resultados, el restaurante decide ampliar sus ofertas de acuerdo a
    //la siguiente escala de consumo (ver tabla). Determinar el monto del descuento, el importe
    // del impuesto y el importe a pagar.
    public static void main(String[] args) {
        Scanner pro20=new Scanner(System.in);
        System.out.println("Ingrese importe consumido");
        int consumo= pro20.nextInt();

        double dsct=consumo*0.10;
        double dsct2=consumo*0.20;
        double dsct3=consumo*0.30;
        double imp19=consumo*0.19;

        if (consumo<=100&&consumo>0){
            System.out.println("Su descuento es de "+dsct);
            System.out.println("Su impuesto es de "+imp19);
            System.out.println("Su total a pagar es "+(consumo-dsct+imp19));
        }else if (consumo>200){
            System.out.println("Su descuento es de "+dsct3);
            System.out.println("Su impuesto es de "+imp19);
            System.out.println("Su total a pagar es "+(consumo-dsct3+imp19));
        }else {
            System.out.println("Su descuento es de "+dsct2);
            System.out.println("Su impuesto es de "+imp19);
            System.out.println("Su total a pagar es "+(consumo-dsct2+imp19));
        }

    }
}

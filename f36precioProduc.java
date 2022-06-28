import java.util.Scanner;

public class f36precioProduc {
    //Una empresa ha establecido diferentes precios para sus productos, según la calidad.
    //Cree un programa que devuelva el precio a pagar por un producto y una calidad dada.
    public static void main(String[] args) {
        Scanner pro36=new Scanner(System.in);
        System.out.println("Ingrese calidad del 1 - 3");
        int calidad= pro36.nextInt();
        System.out.println("Ingrese producto del 1 - 3");
        int producto= pro36.nextInt();

        switch (calidad){
            case 1 -> {
                if (producto == 1) {
                    System.out.println("Precio: "+5000);
                } else if (producto ==2) {
                    System.out.println("Precio: "+4500);
                } else if (producto == 3) {
                    System.out.println("Precio: "+4000);
                }else {
                    System.out.println("Ingrese un producto valido del 1 - 3");
                }
            }
            case 2 -> {
                if (producto == 1) {
                    System.out.println("Precio: "+4500);
                } else if (producto ==2) {
                    System.out.println("Precio: "+4000);
                } else if (producto == 3) {
                    System.out.println("Precio: "+3500);
                }else {
                    System.out.println("Ingrese un producto valido del 1 - 3");
                }
            }
            case 3 -> {
                if (producto == 1) {
                    System.out.println("Precio: "+4000);
                } else if (producto ==2) {
                    System.out.println("Precio: "+3500);
                } else if (producto == 3) {
                    System.out.println("Precio: "+3000);
                }else {
                    System.out.println("Ingrese un producto valido del 1 - 3");
                }
            }default -> System.out.println("Ingrese una calidad validad del 1 - 3");
        }

    }
}

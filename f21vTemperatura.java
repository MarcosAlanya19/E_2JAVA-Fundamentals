import java.util.Scanner;

public class f21vTemperatura {
    //Al ingresar el valor de una temperatura , obtener
    //el tipo de clima segun la siguiente tabla
    public static void main(String[] args) {
        Scanner pro21 = new Scanner(System.in);
        System.out.println("Ingresa temperatura");
        int tem1= pro21.nextInt();

        if (tem1<10){
            System.out.println("Con temp "+tem1+" el clima es frio");
        } else if (tem1>=10&&tem1<=20) {
            System.out.println("Con temp "+tem1+" el clima es nublado");
        } else if (tem1>=21&&tem1<=30) {
            System.out.println("Con temp "+tem1+" el clima es caluroso");
        } else if (tem1>30) {
            System.out.println("Con temp "+tem1+" el clima es tropical");
        }else {
            System.out.println("Ingrese una temperatura en numero");
        }
    }
}

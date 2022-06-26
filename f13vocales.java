import java.util.Scanner;

public class f13vocales {
    //Dado un carácter determinar si es una vocal.
    public static void main(String[] args) {
        Scanner pro13 = new Scanner(System.in);
        System.out.println("Ingresa caracter");
        String vocal = pro13.next();

        if (vocal.equalsIgnoreCase("a")||vocal.equalsIgnoreCase("e")
                ||vocal.equalsIgnoreCase("i")||vocal.equalsIgnoreCase("o")
                ||vocal.equalsIgnoreCase("u")) {
            System.out.println(vocal + " si es una vocal");
        } else{
            System.out.println(vocal+" no es una vocal");
        }
    }
}
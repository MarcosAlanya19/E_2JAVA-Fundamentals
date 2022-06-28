import java.util.Scanner;

public class f29letraVocal {
    //Dada una letra, determinar si es una vocal.
    public static void main(String[] args) {
        Scanner pro29=new Scanner(System.in);
        System.out.println("ingresa letra");
        String l1= pro29.nextLine();

        switch (l1){
            case "a","e","i","o","u" -> System.out.println("Es vocal");
            default -> System.out.println("No es vocal");
        }
    }
}

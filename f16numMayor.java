import java.util.Scanner;

public class f16numMayor {
    //Dados tres números enteros, devolver el número mayor.
    public static void main(String[] args) {
        Scanner pro16=new Scanner(System.in);
        System.out.println("Ingresa n1");
        int n1= pro16.nextInt();
        System.out.println("Ingresa n2");
        int n2= pro16.nextInt();
        System.out.println("Ingresa n3");
        int n3= pro16.nextInt();

        int[] arrayEnteros= {n1,n2,n3};
        int numMayor= arrayEnteros[0];
        for (int i=1; i<arrayEnteros.length;i++){
            if(arrayEnteros[i]>numMayor){
                numMayor=arrayEnteros[i];
            }
        }
        System.out.println("El mayor es "+numMayor);
    }
}

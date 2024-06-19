import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner entrada = new Scanner(System.in);
        int numero = 0;
        System.out.println("Enter a number:");
        numero = entrada.nextInt();
        int calculo = numero % 2;
        if(calculo > 0 )
        {
            System.out.println("Numero impar!");
        }else
        {
            System.out.println("Numero par!");
        }
        
    }
}

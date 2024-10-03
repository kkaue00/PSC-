import java.util.Scanner;

public class ex10 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 5 == 0) 
        {
            System.out.println("O número é divisível por 5.");
        } 
        else 
        {
            System.out.println("O número não é divisível por 5.");
        }

        scanner.close();
    }
}

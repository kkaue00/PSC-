import java.util.Scanner;

public class ex12 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 10 == 0) 
        {
            System.out.println("O número é divisível por 10.");
        } 
        else if (numero % 5 == 0) 
        {
            System.out.println("O número é divisível por 5.");
        } 
        else if (numero % 2 == 0) 
        {
            System.out.println("O número é divisível por 2.");
        } 
        else 
        {
            System.out.println("O número não é divisível por 10, 5 ou 2.");
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ex6 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero > 20) 
        {
            System.out.println("O número é maior do que 20.");
        } 
        else if (numero == 20) 
        {
            System.out.println("O número é igual a 20.");
        } 
        else 
        {
            System.out.println("O número é menor do que 20.");
        }

        scanner.close();
    }
}

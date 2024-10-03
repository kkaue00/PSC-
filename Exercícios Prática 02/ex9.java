import java.util.Scanner;

public class ex9 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero % 3 == 0) 
        {
            System.out.println("O número é múltiplo de 3.");
        } 
        else 
        {
            System.out.println("O número não é múltiplo de 3.");
        }

        scanner.close();
    }
}

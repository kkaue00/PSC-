import java.util.Scanner;

public class ex19 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();

        if (numero1 > numero2) 
        {
            System.out.println("Números em ordem decrescente: " + numero1 + ", " + numero2);
        } 
        else 
        {
            System.out.println("Números em ordem decrescente: " + numero2 + ", " + numero1);
        }

        scanner.close();
    }
}

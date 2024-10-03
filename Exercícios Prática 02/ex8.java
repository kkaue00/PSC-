import java.util.Scanner;

public class ex8 
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
            System.out.println("O maior número é: " + numero1);
        } 
        else 
        {
            System.out.println("O maior número é: " + numero2);
        }

        scanner.close();
    }
}

import java.util.Scanner;

public class ex40 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();
        
        gerarFibonacci(numero);
        scanner.close();
    }

    public static void gerarFibonacci(int n) 
    {
        int a = 0, b = 1;
        
        while (a <= n) 
        {
            if (a > 0) 
            {
                System.out.print(a + " ");
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }
        System.out.println();
    }
}

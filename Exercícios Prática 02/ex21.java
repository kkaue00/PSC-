import java.util.Scanner;

public class ex21 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        int maior = numero1;

        if (numero2 > maior) 
        {
            maior = numero2;
        }
        if (numero3 > maior) 
        {
            maior = numero3;
        }

        System.out.println("O maior número é: " + maior);

        scanner.close();
    }
}

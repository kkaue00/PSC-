import java.util.Scanner;

public class expressao 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = scanner.nextDouble();

        double x = 2 * ((a - c) / 8) - b * 5;

        System.out.printf("O resultado da expressão é: %.2f%n", x);

        scanner.close();
    }
}

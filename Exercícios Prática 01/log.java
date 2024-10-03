import java.util.Scanner;

public class log 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double logaritmo = Math.log10(numero);

        System.out.printf("O logaritmo de %.2f na base 10 é: %.4f%n", numero, logaritmo);

        scanner.close();
    }
}

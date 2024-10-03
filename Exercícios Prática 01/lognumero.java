import java.util.Scanner;

public class lognumero 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        System.out.print("Digite a base para o logaritmo: ");
        double base = scanner.nextDouble();

        double logaritmo = Math.log(numero) / Math.log(base);

        System.out.printf("O logaritmo de %.2f na base %.2f é: %.4f%n", numero, base, logaritmo);

        scanner.close();
    }
}

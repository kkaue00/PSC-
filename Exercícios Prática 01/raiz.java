import java.util.Scanner;

public class raiz 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        double numero = scanner.nextDouble();

        double quadrado = numero * numero;
        double raizQuadrada = Math.sqrt(numero);

        System.out.printf("Número: %.2f%n", numero);
        System.out.printf("Quadrado: %.2f%n", quadrado);
        System.out.printf("Raiz quadrada: %.2f%n", raizQuadrada);

        scanner.close();
    }
}

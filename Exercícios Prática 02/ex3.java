import java.util.Scanner;

public class ex3 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextDouble();

        if (numero > 0) 
        {
            double raizQuadrada = Math.sqrt(numero);
            System.out.printf("Raiz quadrada: %.2f%n", raizQuadrada);
        } 
        else 
        {
            double quadrado = numero * numero;
            System.out.printf("Quadrado: %.2f%n", quadrado);
        }

        scanner.close();
    }
}

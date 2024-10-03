import java.util.Scanner;

public class ex20 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        double menor = Math.min(numero1, numero2);
        double maior = Math.max(numero1, numero2);

        double quadradoMenor = menor * menor;
        double raizQuadradaMaior = Math.sqrt(maior);

        System.out.println("Quadrado do menor número: " + quadradoMenor);
        System.out.printf("Raiz quadrada do maior número: %.2f%n", raizQuadradaMaior);

        scanner.close();
    }
}

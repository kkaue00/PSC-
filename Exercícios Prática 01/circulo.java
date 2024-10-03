import java.util.Scanner;

public class circulo 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        final double PI = 3.14159;

        System.out.print("Digite o raio do círculo: ");
        double raio = scanner.nextDouble();

        double area = PI * raio * raio;

        System.out.printf("A área do círculo é: %.2f%n", area);

        scanner.close();
    }
}

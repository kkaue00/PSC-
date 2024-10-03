import java.util.Scanner;

public class ex42 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o limite inferior em Celsius: ");
        int limiteInferior = scanner.nextInt();
        
        System.out.print("Digite o limite superior em Celsius: ");
        int limiteSuperior = scanner.nextInt();
        
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Tabela de Conversão de Celsius para Fahrenheit");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s%n", "Celsius", "Fahrenheit");

        for (int c = limiteInferior; c <= limiteSuperior; c += incremento) 
        {
            double f = (c * 9.0 / 5.0) + 32;
            System.out.printf("%-10d %-10.2f%n", c, f);
        }

        scanner.close();
    }
}

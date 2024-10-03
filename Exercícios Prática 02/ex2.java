import java.util.Scanner;

public class ex2 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double numero1, numero2, soma;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextDouble();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextDouble();

        soma = numero1 + numero2;

        if (soma <= 20) 
        {
            soma -= 5;
        }

        System.out.println("Resultado: " + soma);

        scanner.close();
    }
}

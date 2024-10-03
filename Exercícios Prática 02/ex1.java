import java.util.Scanner;

public class ex1 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int valor1, valor2, soma;

        System.out.print("Digite o primeiro valor: ");
        valor1 = scanner.nextInt();
        System.out.print("Digite o segundo valor: ");
        valor2 = scanner.nextInt();

        soma = valor1 + valor2;

        if (soma > 10) 
        {
            System.out.println("A soma é: " + soma);
        }

        scanner.close();
    }
}

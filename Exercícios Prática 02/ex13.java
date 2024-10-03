import java.util.Scanner;

public class ex13 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro de 3 dígitos: ");
        numero = scanner.nextInt();

        int dezenas = (numero / 10) % 10;

        if (dezenas % 2 == 0) 
        {
            System.out.println("O algarismo da casa das dezenas é par.");
        } 
        else 
        {
            System.out.println("O algarismo da casa das dezenas é ímpar.");
        }

        scanner.close();
    }
}

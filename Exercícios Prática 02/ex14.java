import java.util.Scanner;

public class ex14 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número inteiro de 4 dígitos: ");
        numero = scanner.nextInt();

        int unidadesDeMilhar = (numero / 1000) % 10;
        int centenas = (numero / 100) % 10;
        int formado = unidadesDeMilhar * 10 + centenas;

        if (formado % 4 == 0) 
        {
            System.out.println("O número formado é múltiplo de 4.");
        } 
        else 
        {
            System.out.println("O número formado não é múltiplo de 4.");
        }

        scanner.close();
    }
}

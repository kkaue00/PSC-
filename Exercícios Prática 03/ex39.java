import java.util.Scanner;

public class ex39 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int maior = Integer.MIN_VALUE; // Inicializa com o menor valor possível

        System.out.println("Digite vários números (digite -9999 para sair):");

        while (true) 
        {
            numero = scanner.nextInt();
            if (numero == -9999) 
            {
                break;
            }

            if (numero > maior) 
            {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) 
        {
            System.out.println("O maior número digitado foi: " + maior);
        } 
        else 
        {
            System.out.println("Nenhum número válido foi digitado.");
        }
    }
}

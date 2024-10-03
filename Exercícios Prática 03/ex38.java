import java.util.Scanner;

public class ex38 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contadorPrimos = 0;

        System.out.println("Digite números inteiros positivos (digite um número não positivo para sair):");

        while (true) 
        {
            numero = scanner.nextInt();

            if (numero <= 0) 
            {
                break;
            }

            if (isPrimo(numero)) 
            {
                contadorPrimos++;
            }
        }

        System.out.println("Quantidade de números primos digitados: " + contadorPrimos);
    }

    private static boolean isPrimo(int num) 
    {
        if (num < 2) 
        {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(num); i++) 
        {
            if (num % i == 0) 
            {
                return false;
            }
        }
        return true;
    }
}

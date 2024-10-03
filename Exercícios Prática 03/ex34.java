import java.util.Scanner;

public class ex34 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Digite vários números (digite -999 para sair):");

        while (true) 
        {
            numero = scanner.nextInt();
            if (numero == -999) 
            {
                break;
            }
            System.out.println("Divisores de " + numero + ":");
            for (int i = 1; i <= Math.abs(numero); i++) 
            {
                if (numero % i == 0) 
                {
                    System.out.println(i);
                }
            }
        }
    }
}

import java.util.Scanner;

public class ex37 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (numero < 2) 
        {
            System.out.println(numero + " não é um número primo.");
        } 
        else 
        {
            boolean isPrimo = true;

            for (int i = 2; i <= Math.sqrt(numero); i++) 
            {
                if (numero % i == 0) 
                {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) 
            {
                System.out.println(numero + " é um número primo.");
            } 
            else 
            {
                System.out.println(numero + " não é um número primo.");
            }
        }
    }
}

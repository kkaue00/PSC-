import java.util.Scanner;

public class ex5 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        if (numero >= 20 && numero <= 90) 
        {
            System.out.println("O número está compreendido entre 20 e 90.");
        } 
        else 
        {
            System.out.println("O número não está compreendido entre 20 e 90.");
        }

        scanner.close();
    }
}

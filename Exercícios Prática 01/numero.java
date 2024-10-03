import java.util.Scanner;

public class numero 
{    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        System.out.println("O valor do número digitado é: " + numero);

        scanner.close();
    }
}
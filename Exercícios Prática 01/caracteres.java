import java.util.Scanner;

public class caracteres 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char[] caracteres = new char[10];

        System.out.println("Digite 10 caracteres:");

        for (int i = 0; i < 10; i++) 
        {
            System.out.print("Caractere " + (i + 1) + ": ");
            caracteres[i] = scanner.next().charAt(0);
        }

        String palavra = new String(caracteres);
        System.out.println("A palavra formada é: " + palavra);

        scanner.close();
    }
}
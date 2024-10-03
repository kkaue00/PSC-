import java.util.Scanner;

public class quadrado 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = scanner.nextInt();

        double resultado = Math.pow(numero, 2);

        System.out.println("O quadrado de " + numero + " é: " + resultado);

        scanner.close();
    }
}
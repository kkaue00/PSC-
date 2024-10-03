import java.util.Scanner;

public class ex23
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero1, numero2, numero3;
        int maior, intermediario, menor;

        System.out.print("Digite o primeiro número: ");
        numero1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        numero2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        numero3 = scanner.nextInt();

        maior = numero1;
        menor = numero1;

        if (numero2 > maior) 
        {
            maior = numero2;
        }
        if (numero3 > maior) 
        {
            maior = numero3;
        }

        if (numero2 < menor) 
        {
            menor = numero2;
        }
        if (numero3 < menor) 
        {
            menor = numero3;
        }

        intermediario = numero1 + numero2 + numero3 - maior - menor;

        System.out.println("Maior: " + maior);
        System.out.println("Intermediário: " + intermediario);
        System.out.println("Menor: " + menor);

        scanner.close();
    }
}

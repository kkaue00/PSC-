import java.util.Scanner;

public class ex27
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int soma = 0;
        int contador = 0;
        int numero;

        System.out.println("Digite números positivos (digite um número negativo para sair):");

        while (true) 
        {
            numero = scanner.nextInt();
            if (numero < 0) 
            {
                break;
            }
            soma += numero;
            contador++;
        }

        if (contador > 0) 
        {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } 
        else 
        {
            System.out.println("Nenhum número positivo foi digitado.");
        }
    }
}

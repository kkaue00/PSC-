import java.util.Scanner;

public class ex11 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.print("Digite um número: ");
        numero = scanner.nextInt();

        boolean divisivelPorTres = (numero % 3 == 0);
        boolean divisivelPorSete = (numero % 7 == 0);

        if (divisivelPorTres && divisivelPorSete) 
        {
            System.out.println("O número é divisível por 3 e por 7.");
        } 
        else 
        {
            System.out.println("O número não é divisível por 3 e por 7.");
        }

        scanner.close();
    }
}

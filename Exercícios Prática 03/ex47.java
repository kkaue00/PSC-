import java.util.Scanner;

public class ex47 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de números pares que deseja imprimir: ");
        int quantidade = scanner.nextInt();

        System.out.println("Números pares:");
        
        for (int i = 1; i <= quantidade; i++) 
        {
            System.out.print((i * 2) + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}

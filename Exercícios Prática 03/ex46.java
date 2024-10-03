import java.util.Scanner;

public class ex46 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();

        System.out.println("Números ímpares menores que " + limiteSuperior + ":");
        
        for (int i = 1; i < limiteSuperior; i += 2) 
        {
            System.out.print(i + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}

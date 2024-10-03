import java.util.Scanner;

public class ex44 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o limite superior: ");
        int limiteSuperior = scanner.nextInt();
        
        System.out.print("Digite o incremento: ");
        int incremento = scanner.nextInt();

        System.out.println("Números no intervalo de 0 até " + limiteSuperior + " com incremento de " + incremento + ":");
        
        for (int i = 0; i <= limiteSuperior; i += incremento) 
        {
            System.out.print(i + " ");
        }
        
        System.out.println();
        scanner.close();
    }
}

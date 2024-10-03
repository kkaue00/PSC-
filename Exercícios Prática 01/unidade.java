import java.util.Scanner;

public class unidade
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        char milhar, centena, dezena, unidade;

        System.out.print("Digite o milhar (um número): ");
        milhar = scanner.next().charAt(0);
        
        System.out.print("Digite a centena (um número): ");
        centena = scanner.next().charAt(0);
        
        System.out.print("Digite a dezena (um número): ");
        dezena = scanner.next().charAt(0);
        
        System.out.print("Digite a unidade (um número): ");
        unidade = scanner.next().charAt(0);

        String resultado = "" + milhar + centena + dezena + unidade;
        System.out.println("O número formado é: " + resultado);

        scanner.close();
    }
}

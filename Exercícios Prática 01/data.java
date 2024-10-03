import java.util.Scanner;

public class data
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = scanner.nextInt();
        
        System.out.print("Digite o mês: ");
        int mes = scanner.nextInt();
        
        System.out.print("Digite o ano: ");
        int ano = scanner.nextInt();

        System.out.printf("A data é: %02d/%02d/%d%n", dia, mes, ano);

        scanner.close();
    }
}
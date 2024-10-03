import java.util.Scanner;

public class ex15 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int anoNascimento, anoAtual;

        System.out.print("Digite o ano de nascimento: ");
        anoNascimento = scanner.nextInt();
        System.out.print("Digite o ano atual: ");
        anoAtual = scanner.nextInt();

        if (anoNascimento > 0 && anoAtual >= anoNascimento) 
        {
            int idade = anoAtual - anoNascimento;
            System.out.println("A idade da pessoa é: " + idade + " anos.");
        } 
        else 
        {
            System.out.println("Ano de nascimento inválido.");
        }

        scanner.close();
    }
}

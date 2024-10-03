import java.util.Scanner;

public class ex29 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String nome;

        System.out.println("Digite nomes (digite 'FIM' para sair):");

        while (true) 
        {
            nome = scanner.nextLine();
            if (nome.equalsIgnoreCase("FIM")) 
            {
                break;
            }
            System.out.println("Nome digitado: " + nome);
        }
    }
}

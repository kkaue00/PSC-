import java.util.Scanner;

public class ex7 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String nome;
        char sexo;
        int idade;

        System.out.print("Digite o nome: ");
        nome = scanner.nextLine();
        System.out.print("Digite o sexo (f ou m): ");
        sexo = scanner.next().charAt(0);
        System.out.print("Digite a idade: ");
        idade = scanner.nextInt();

        if ((sexo == 'f' || sexo == 'F') && idade < 25) 
        {
            System.out.println(nome + ", ACEITA.");
        } 
        else 
        {
            System.out.println(nome + ", NÃO ACEITA.");
        }

        scanner.close();
    }
}

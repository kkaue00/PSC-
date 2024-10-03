import java.util.Scanner;

public class dias
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        int diasVividos = idade * 365; // Aproximando considerando 365 dias por ano

        System.out.println("Você viveu aproximadamente " + diasVividos + " dias.");

        scanner.close();
    }
}
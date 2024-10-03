import java.util.Scanner;

public class ex45
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[20];
        int[] idades = new int[20];
        char[] sexos = new char[20];

        for (int i = 0; i < 20; i++) 
        {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();

            System.out.print("Digite a idade de " + nomes[i] + ": ");
            idades[i] = scanner.nextInt();

            System.out.print("Digite o sexo de " + nomes[i] + " (M/F): ");
            sexos[i] = scanner.next().charAt(0);
            scanner.nextLine();  
        }

        System.out.println("\nNomes de pessoas do sexo masculino com mais de 21 anos:");
        for (int i = 0; i < 20; i++) 
        {
            if (sexos[i] == 'M' || sexos[i] == 'm') 
            {
                if (idades[i] > 21) 
                {
                    System.out.println(nomes[i]);
                }
            }
        }

        scanner.close();
    }
}

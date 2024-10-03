import java.util.Scanner;

public class ex36 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int idade;
        int totalMenor21 = 0;
        int totalMaior50 = 0;

        while (true) 
        {
            System.out.print("Digite a idade (ou uma idade fora da faixa 0-120 para sair): ");
            idade = scanner.nextInt();

            if (idade < 0 || idade > 120) 
            {
                break;
            }

            if (idade < 21) 
            {
                totalMenor21++;
            }

            if (idade > 50) 
            {
                totalMaior50++;
            }
        }

        System.out.println("Total de pessoas com menos de 21 anos: " + totalMenor21);
        System.out.println("Total de pessoas com mais de 50 anos: " + totalMaior50);
    }
}

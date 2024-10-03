import java.util.Scanner;

public class ex35 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int codigo;
        double consumo;
        int tipo;
        double custo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        double somaTipo1 = 0, somaTipo2 = 0;
        int contadorTipo1 = 0, contadorTipo2 = 0;

        while (true) 
        {
            System.out.print("Digite o código do consumidor (0 para sair): ");
            codigo = scanner.nextInt();
            if (codigo == 0) 
            {
                break;
            }

            System.out.print("Digite a quantidade de kWh consumidos: ");
            consumo = scanner.nextDouble();
            System.out.print("Digite o tipo do consumidor (1 - residencial, 2 - comercial, 3 - industrial): ");
            tipo = scanner.nextInt();

            switch (tipo) 
            {
                case 1:
                    custo = consumo * 0.3;
                    totalResidencial += consumo;
                    somaTipo1 += consumo;
                    contadorTipo1++;
                    break;
                case 2:
                    custo = consumo * 0.5;
                    totalComercial += consumo;
                    somaTipo2 += consumo;
                    contadorTipo2++;
                    break;
                case 3:
                    custo = consumo * 0.7;
                    totalIndustrial += consumo;
                    break;
                default:
                    System.out.println("Tipo inválido. Tente novamente.");
                    continue;
            }

            System.out.printf("Custo total para o consumidor %d: R$ %.2f%n", codigo, custo);
        }

        System.out.printf("Total de consumo residencial: %.2f kWh%n", totalResidencial);
        System.out.printf("Total de consumo comercial: %.2f kWh%n", totalComercial);
        System.out.printf("Total de consumo industrial: %.2f kWh%n", totalIndustrial);

        if (contadorTipo1 > 0) 
        {
            double mediaTipo1 = somaTipo1 / contadorTipo1;
            System.out.printf("Média de consumo residencial: %.2f kWh%n", mediaTipo1);
        }

        if (contadorTipo2 > 0) 
        {
            double mediaTipo2 = somaTipo2 / contadorTipo2;
            System.out.printf("Média de consumo comercial: %.2f kWh%n", mediaTipo2);
        }
    }
}

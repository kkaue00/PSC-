import java.util.Scanner;

public class ex49 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double num1, num2;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextDouble();

        int opcao;

        do 
        {
            System.out.println("Operações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.print("Digite o número de ordem da opção desejada: ");
            opcao = scanner.nextInt();

            switch (opcao) 
            {
                case 1:
                    System.out.printf("Resultado: %.2f%n", num1 + num2);
                    break;
                case 2:
                    System.out.printf("Resultado: %.2f%n", num1 - num2);
                    break;
                case 3:
                    System.out.printf("Resultado: %.2f%n", num1 * num2);
                    break;
                case 4:
                    if (num2 != 0) 
                    {
                        System.out.printf("Resultado: %.2f%n", num1 / num2);
                    } 
                    else 
                    {
                        System.out.println("Erro: Divisão por zero.");
                    }
                    break;
                case 9:
                    System.out.println("Saindo do programa.");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 9);

        scanner.close();
    }
}

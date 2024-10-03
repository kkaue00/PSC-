import java.util.Scanner;

public class ex48 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double totalAPagar = 0.0;

        while (true) 
        {
            double preco;
            int quantidade;

            do 
            {
                System.out.print("Digite o preço da mercadoria: ");
                preco = scanner.nextDouble();

                if (preco < 0) 
                {
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    return;
                }

            } while (preco < 0);

            do 
            {
                System.out.print("Digite a quantidade comprada (0 para finalizar): ");
                quantidade = scanner.nextInt();

                if (quantidade < 0) 
                {
                    System.out.println("Quantidade não pode ser negativa. Tente novamente.");
                }

            } while (quantidade < 0);

            if (quantidade == 0) 
            {
                break;
            }

            totalAPagar += preco * quantidade;
        }

        System.out.printf("Total a ser pago: R$ %.2f%n", totalAPagar);
        scanner.close();
    }
}

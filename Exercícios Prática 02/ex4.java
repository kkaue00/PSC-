import java.util.Scanner;

public class ex4 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, num3;

        System.out.print("Digite o primeiro número: ");
        num1 = scanner.nextInt();
        System.out.print("Digite o segundo número: ");
        num2 = scanner.nextInt();
        System.out.print("Digite o terceiro número: ");
        num3 = scanner.nextInt();

        if (num1 > num2) 
        {
            int temp = num1;
            num1 = num2;
            num2 = temp;
        }

        if (num1 > num3) 
        {
            int temp = num1;
            num1 = num3;
            num3 = temp;
        }

        if (num2 > num3) 
        {
            int temp = num2;
            num2 = num3;
            num3 = temp;
        }

        System.out.println("Números em ordem crescente: " + num1 + ", " + num2 + ", " + num3);

        scanner.close();
    }
}

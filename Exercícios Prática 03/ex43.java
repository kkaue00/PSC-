import java.util.Scanner;

public class ex43
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite um número inteiro não negativo: ");
        int numero = scanner.nextInt();
        
        if (numero < 0) 
        {
            System.out.println("O fatorial não é definido para números negativos.");
        } 
        else 
        {
            long fatorial = calcularFatorial(numero);
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }
        
        scanner.close();
    }

    public static long calcularFatorial(int n) 
    {
        long resultado = 1;
        for (int i = 2; i <= n; i++) 
        {
            resultado *= i;
        }
        return resultado;
    }
}

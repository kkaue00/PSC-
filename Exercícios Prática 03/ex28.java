import java.util.Scanner;

public class ex28 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int contador = 0;

        System.out.println("Digite vários números (digite 0 para sair):");

        while (true) 
        {
            numero = scanner.nextInt();
            if (numero == 0) 
            {
                break;
            }
            if (numero >= 100 && numero <= 200) 
            {
                contador++;
            }
        }

        System.out.println("Total de números entre 100 e 200: " + contador);
    }
}

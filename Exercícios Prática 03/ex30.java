import java.util.Scanner;

public class ex30 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        double numero;

        System.out.println("Digite vários números (digite -999 para sair):");

        while (true) 
        {
            numero = scanner.nextDouble();
            if (numero == -999) 
            {
                break;
            }
            if (numero >= 0) 
            {
                System.out.println("Raiz quadrada de " + numero + ": " + Math.sqrt(numero));
            }
            System.out.println("Inverso de " + numero + ": " + (1 / numero));
        }
    }
}

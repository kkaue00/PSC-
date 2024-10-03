import java.util.Scanner;

public class diamesano 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a data no formato dd/mm/aa: ");
        String data = scanner.nextLine();

        String[] partes = data.split("/");

        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];

        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);

        scanner.close();
    }
}

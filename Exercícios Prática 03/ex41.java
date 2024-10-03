public class ex41 
{
    public static void main(String[] args) 
    {
        System.out.println("Tabela de Conversão de Polegadas para Centímetros");
        System.out.println("------------------------------------------------");
        System.out.printf("%-10s %-10s%n", "Polegadas", "Centímetros");

        for (int i = 1; i <= 20; i++) 
        {
            double centimetros = i * 2.54;
            System.out.printf("%-10d %-10.2f%n", i, centimetros);
        }
    }
}

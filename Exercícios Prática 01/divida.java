import java.util.Scanner;

public class divida 
{
    public static void main(String[] args) 
    {
        double valorInicial = 100.00; 
        double juros = 10.0;           
        int meses = 8;                 

        double valorFinal = valorInicial * Math.pow((1 + juros / 100), meses);

        System.out.printf("Depois de %d meses, você deverá R$ %.2f.%n", meses, valorFinal);
    }
}

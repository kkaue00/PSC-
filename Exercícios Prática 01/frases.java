import java.util.Scanner;

public class frases  
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a primeira frase: ");
        String frase1 = scanner.nextLine();
        
        System.out.print("Digite a segunda frase: ");
        String frase2 = scanner.nextLine();
        
        System.out.print("Digite a terceira frase: ");
        String frase3 = scanner.nextLine();

        int meio1 = frase1.length() / 2;
        int meio2 = frase2.length() / 2;
        int meio3 = frase3.length() / 2;

        String parte1 = frase2.substring(0, meio2);
        String parte2 = frase3.substring(meio3);
        String parte3 = frase2.substring(meio2);
        String parte4 = frase1.substring(0, meio1);
        String parte5 = frase3.substring(0, meio3);
        String parte6 = frase1.substring(meio1);

        String fraseEmbaralhada = parte1 + parte2 + parte3 + parte4 + parte5 + parte6;
        String frasesConcatenadas = frase1 + " " + frase2 + " " + frase3;

        System.out.println("Frases originais concatenadas: " + frasesConcatenadas);
        System.out.println("Frase embaralhada: " + fraseEmbaralhada);

        scanner.close();
    }
}

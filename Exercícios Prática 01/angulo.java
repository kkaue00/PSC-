import java.util.Scanner;

public class angulo
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um ângulo em graus: ");
        double anguloGraus = scanner.nextDouble();

        double anguloRadianos = Math.toRadians(anguloGraus);

        double seno = Math.sin(anguloRadianos);
        double cosseno = Math.cos(anguloRadianos);
        double tangente = Math.tan(anguloRadianos);
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;

        System.out.printf("Seno: %.4f%n", seno);
        System.out.printf("Cosseno: %.4f%n", cosseno);
        System.out.printf("Tangente: %.4f%n", tangente);
        System.out.printf("Secante: %.4f%n", secante);
        System.out.printf("Cossecante: %.4f%n", cossecante);
        System.out.printf("Cotangente: %.4f%n", cotangente);

        scanner.close();
    }
}

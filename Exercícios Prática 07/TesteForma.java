abstract class Forma 
{
    public abstract double calcularArea();
    public abstract double calcularPerimetro();
}

class Retangulo extends Forma 
{
    private double largura;
    private double altura;

    public Retangulo(double largura, double altura) 
    {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() 
    {
        return largura * altura;
    }

    public double calcularPerimetro() 
    {
        return 2 * (largura + altura);
    }
}

class Circulo extends Forma 
{
    private double raio;

    public Circulo(double raio) 
    {
        this.raio = raio;
    }

    public double calcularArea() 
    {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() 
    {
        return 2 * Math.PI * raio;
    }
}

public class TesteForma 
{
    public static void main(String[] args) 
    {
        Forma retangulo = new Retangulo(5, 3);
        System.out.println("Área do Retângulo: " + retangulo.calcularArea());
        System.out.println("Perímetro do Retângulo: " + retangulo.calcularPerimetro());

        Forma circulo = new Circulo(4);
        System.out.println("Área do Círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do Círculo: " + circulo.calcularPerimetro());
    }
}
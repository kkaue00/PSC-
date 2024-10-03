public class ex33 
{
    public static void main(String[] args) 
    {
        int soma = 0;

        for (int i = 1; i <= 100; i++) 
        {
            System.out.println(i);
            soma += i;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + soma);
    }
}

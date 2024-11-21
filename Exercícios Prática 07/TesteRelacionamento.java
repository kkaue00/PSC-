class Animal 
{
    public void mover() 
    {
        System.out.println("O animal está se movendo...");
    }
}

class Cachorro extends Animal 
{
    public void latir() 
    {
        System.out.println("O cachorro está latindo: Au au!");
    }
}

public class TesteRelacionamento 
{
    public static void main(String[] args) 
    {
        Cachorro cachorro = new Cachorro();
        cachorro.mover();
        cachorro.latir();
    }
}
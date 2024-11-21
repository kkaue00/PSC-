interface Animal 
{
    void fazerSom();
    void mover();
}

class Cachorro implements Animal 
{
    public void fazerSom() 
    {
        System.out.println("O cachorro está latindo: Au au!");
    }

    public void mover() 
    {
        System.out.println("O cachorro está correndo...");
    }
}

public class TesteInterface 
{
    public static void main(String[] args) 
    {
        Animal cachorro = new Cachorro();
        cachorro.fazerSom();
        cachorro.mover();
    }
}
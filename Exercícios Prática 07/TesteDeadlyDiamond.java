class Animal 
{
    public void mover() 
    {
        System.out.println("Animal está se movendo.");
    }
}

class Cavalo extends Animal 
{
    @Override
    public void mover() 
    {
        System.out.println("Cavalo está correndo.");
    }
}

class Pegasus extends Cavalo 
{
    @Override
    public void mover() 
    {
        super.mover();
        System.out.println("Pegasus está voando.");
    }
}

public class TesteDeadlyDiamond 
{
    public static void main(String[] args) 
    {
        Pegasus pegasus = new Pegasus();
        pegasus.mover();
    }
}
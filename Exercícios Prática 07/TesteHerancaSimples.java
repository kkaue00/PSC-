class Animal 
{
    private String nome;

    public Animal(String nome) 
    {
        this.nome = nome;
    }

    public String getNome() 
    {
        return nome;
    }

    public void mover() 
    {
        System.out.println(nome + " está se movendo.");
    }
}

class Cachorro extends Animal 
{
    public Cachorro(String nome) 
    {
        super(nome);
    }

    public void latir() 
    {
        System.out.println(getNome() + " está latindo: Au au!");
    }

    @Override
    public void mover() 
    {
        System.out.println(getNome() + " está correndo.");
    }
}

public class TesteHerancaSimples 
{
    public static void main(String[] args) 
    {
        Cachorro cachorro = new Cachorro("Rex");
        cachorro.mover();
        cachorro.latir();
    }
}

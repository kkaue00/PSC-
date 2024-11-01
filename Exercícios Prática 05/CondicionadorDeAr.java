public class CondicionadorDeAr 
{
    private Termostato termostato;
    private boolean ligado;

    public CondicionadorDeAr() 
    {
        this.termostato = new Termostato();
        this.ligado = false;
    }

    public void ligar() 
    {
        ligado = true;
    }

    public void desligar() 
    {
        ligado = false;
    }

    public void aumentarTemperatura() 
    {
        if (ligado && termostato.getTemperatura() < 28) 
        {
            termostato.setTemperatura(termostato.getTemperatura() + 1);
        }
    }

    public void reduzirTemperatura() 
    {
        if (ligado && termostato.getTemperatura() > 15) 
        {
            termostato.setTemperatura(termostato.getTemperatura() - 1);
        }
    }

    public void imprimirTemperatura() 
    {
        if (ligado) 
        {
            System.out.println("Temperatura: " + termostato.getTemperatura());
        }
    }
}
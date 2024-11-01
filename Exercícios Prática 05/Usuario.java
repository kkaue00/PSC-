public class Usuario 
{
    public static void main(String[] args) 
    {
        CondicionadorDeAr ar = new CondicionadorDeAr();
        ar.aumentarTemperatura();
        ar.reduzirTemperatura();
        ar.ligar();
        ar.aumentarTemperatura();
        ar.imprimirTemperatura();
    }
}
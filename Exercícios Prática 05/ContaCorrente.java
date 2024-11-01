public class ContaCorrente 
{
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, int digito, Agencia agencia, double saldo) 
    {
        this.numero = numero;
        this.digito = digito;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public int getNumero() 
    {
        return numero;
    }

    public void setNumero(int numero) 
    {
        this.numero = numero;
    }

    public int getDigito() 
    {
        return digito;
    }

    public void setDigito(int digito) 
    {
        this.digito = digito;
    }

    public Agencia getAgencia() 
    {
        return agencia;
    }

    public void setAgencia(Agencia agencia) 
    {
        this.agencia = agencia;
    }

    public double getSaldo() 
    {
        return saldo;
    }

    public void depositar(double valor) 
    {
        saldo += valor;
    }

    public double sacar(double valor) 
    {
        if (saldo >= valor) 
        {
            saldo -= valor;
            return valor;
        } 
        else 
        {
            System.out.println("Saque não realizado. Saldo insuficiente.");
            return 0;
        }
    }

    public void consultarSaldo() 
    {
        System.out.println("Saldo: " + saldo);
    }
}
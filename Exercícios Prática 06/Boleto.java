public class Boleto extends Pagamento
{
    private String numeroDoBoleto;
    private int dia;
    private int mes;
    private int ano;

    public Boleto()
    {
        super();
        this.numeroDoBoleto = "N/A";
        this.dia = 0;
        this.mes = 0;
        this.ano = 0;
    }

    public Boleto(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoBoleto, int dia, int mes, int ano)
    {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoBoleto = numeroDoBoleto;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String getNumeroDoBoleto()
    {
        return numeroDoBoleto;
    }

    public int getDia()
    {
        return dia;
    }

    public int getMes()
    {
        return mes;
    }

    public int getAno()
    {
        return ano;
    }

    public void setNumeroDoBoleto(String numeroDoBoleto)
    {
        this.numeroDoBoleto = numeroDoBoleto;
    }

    public void setDia(int dia)
    {
        this.dia = dia;
    }

    public void setMes(int mes)
    {
        this.mes = mes;
    }

    public void setAno(int ano)
    {
        this.ano = ano;
    }

    @Override
    public String toString()
    {
        return "Boleto [numeroDoBoleto=" + numeroDoBoleto + ", dia=" + dia + ", mes=" + mes + ", ano=" + ano + ", " + super.toString() + "]";
    }
}
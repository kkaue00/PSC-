public class Pagamento
{
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    public Pagamento()
    {
        this.nomeDoPagador = "N/A";
        this.cpf = "N/A";
        this.valorASerPago = 0.0;
    }

    public Pagamento(String nomeDoPagador, String cpf, double valorASerPago)
    {
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }

    public String getNomeDoPagador()
    {
        return nomeDoPagador;
    }

    public String getCpf()
    {
        return cpf;
    }

    public double getValorASerPago()
    {
        return valorASerPago;
    }

    public void setNomeDoPagador(String nomeDoPagador)
    {
        this.nomeDoPagador = nomeDoPagador;
    }

    public void setCpf(String cpf)
    {
        this.cpf = cpf;
    }

    public void setValorASerPago(double valorASerPago)
    {
        this.valorASerPago = valorASerPago;
    }

    @Override
    public String toString()
    {
        return "Pagamento [nomeDoPagador=" + nomeDoPagador + ", cpf=" + cpf + ", valorASerPago=" + valorASerPago + "]";
    }
}
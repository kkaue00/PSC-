public class CartaoDeCredito extends Pagamento
{
    private String numeroDoCartao;

    public CartaoDeCredito()
    {
        super();
        this.numeroDoCartao = "N/A";
    }

    public CartaoDeCredito(String nomeDoPagador, String cpf, double valorASerPago, String numeroDoCartao)
    {
        super(nomeDoPagador, cpf, valorASerPago);
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getNumeroDoCartao()
    {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao)
    {
        this.numeroDoCartao = numeroDoCartao;
    }

    @Override
    public String toString()
    {
        return "CartaoDeCredito [numeroDoCartao=" + numeroDoCartao + ", " + super.toString() + "]";
    }
}
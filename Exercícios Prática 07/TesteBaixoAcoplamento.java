interface ItemCarrinho 
{
    String getDescricao();
    double getPreco();
}

class Produto implements ItemCarrinho 
{
    private String descricao;
    private double preco;

    public Produto(String descricao, double preco) 
    {
        this.descricao = descricao;
        this.preco = preco;
    }

    public String getDescricao() 
    {
        return descricao;
    }

    public double getPreco() 
    {
        return preco;
    }
}

class CarrinhoDeCompras 
{
    private List<ItemCarrinho> itens;

    public CarrinhoDeCompras() 
    {
        itens = new ArrayList<>();
    }

    public void adicionarItem(ItemCarrinho item) 
    {
        itens.add(item);
    }

    public void removerItem(ItemCarrinho item) 
    {
        itens.remove(item);
    }

    public void listarItens() 
    {
        for (ItemCarrinho item : itens) 
        {
            System.out.println("Produto: " + item.getDescricao() + ", Preço: " + item.getPreco());
        }
    }

    public double calcularTotal() 
    {
        double total = 0;
        for (ItemCarrinho item : itens) 
        {
            total += item.getPreco();
        }
        return total;
    }
}

public class TesteBaixoAcoplamento 
{
    public static void main(String[] args) 
    {
        Produto produto1 = new Produto("Camiseta", 39.90);
        Produto produto2 = new Produto("Calça Jeans", 79.90);

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem(produto1);
        carrinho.adicionarItem(produto2);

        carrinho.listarItens();
        System.out.println("Total: " + carrinho.calcularTotal());

        carrinho.removerItem(produto1);
        System.out.println("Após remoção:");
        carrinho.listarItens();
    }
}
public class Caixa {
    private String corredor, dono;
    private int posicao;
    private double peso;

    public Caixa(String corredor, int posicao, double peso, String dono) {
        this.corredor = corredor;
        this.posicao = posicao;
        this.peso = peso;
        this.dono = dono;
    }

    public String getCorredor() {
        return corredor;
    }

    public int getPosicao() {
        return posicao;
    }

    public double getPeso() {
        return peso;
    }

    public String getDono() {
        return dono;
    }

    public void setCorredor(String corredor) {
        this.corredor = corredor;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public String toString() {
        return "[Dono: " + dono + "] [Corredor: " + corredor + "] [Posição: " + posicao +
                "] [Peso: " + peso + "]";
    }
}
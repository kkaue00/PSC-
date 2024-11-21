import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        caixas = new ArrayList<>();
    }

    public void addCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public boolean removeCaixa(String dono) {
        int posicao = procurarCaixa(dono);
        if (posicao >= 0) {
            caixas.remove(posicao);
            return true;
        } else {
            return false;
        }
    }

    public int procurarCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i;
            }
        }
        return -1;
    }

    public void mudarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int posicao = procurarCaixa(dono);
        if (posicao >= 0) {
            Caixa caixa = caixas.get(posicao);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
        }
    }

    public ArrayList<Caixa> procurarPesadas(double pesoMinimo) {
        ArrayList<Caixa> pesadas = new ArrayList<>();
        for (Caixa caixa : caixas) {
            if (caixa.getPeso() > pesoMinimo) {
                pesadas.add(caixa);
            }
        }
        return pesadas;
    }

    public void listarCaixas() {
        for (Caixa caixa : caixas) {
            System.out.println(caixa);
        }
    }
}
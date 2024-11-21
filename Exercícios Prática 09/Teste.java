import javax.swing.JOptionPane;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        int menu;
        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Adicionar caixa\n2) Remover caixa\n3) Procurar caixa\n4) Mudar caixa\n5) Listar caixas pesadas\n6) Sair"));
            if (menu == 1) {
                String dono = JOptionPane.showInputDialog("Dono da caixa:");
                String corredor = JOptionPane.showInputDialog("Corredor da caixa:");
                int posicao = Integer.parseInt(JOptionPane.showInputDialog("Posição da caixa:"));
                double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso da caixa:"));
                deposito.addCaixa(new Caixa(corredor, posicao, peso, dono));
            } else if (menu == 2) {
                String dono = JOptionPane.showInputDialog("Dono da caixa para remover:");
                if (deposito.removeCaixa(dono)) {
                    JOptionPane.showMessageDialog(null, "Caixa removida");
                } else {
                    JOptionPane.showMessageDialog(null, "Caixa não encontrada");
                }
            } else if (menu == 3) {
                String dono = JOptionPane.showInputDialog("Dono da caixa para procurar:");
                int posicao = deposito.procurarCaixa(dono);
                if (posicao >= 0) {
                    JOptionPane.showMessageDialog(null, "Caixa encontrada na posição: " + posicao);
                } else {
                    JOptionPane.showMessageDialog(null, "Caixa não encontrada");
                }
            } else if (menu == 4) {
                String dono = JOptionPane.showInputDialog("Dono da caixa para mudar:");
                String novoCorredor = JOptionPane.showInputDialog("Novo corredor:");
                int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Nova posição:"));
                deposito.mudarCaixa(dono, novoCorredor, novaPosicao);
            } else if (menu == 5) {
                double pesoMinimo = Double.parseDouble(JOptionPane.showInputDialog("Peso mínimo:"));
                ArrayList<Caixa> pesadas = deposito.procurarPesadas(pesoMinimo);
                for (Caixa caixa : pesadas) {
                    System.out.println(caixa);
                }
            } else if (menu == 6) {
                deposito.listarCaixas();
            }
        } while (menu != 6);
    }
}
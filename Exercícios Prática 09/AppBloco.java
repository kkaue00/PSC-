import javax.swing.JOptionPane;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        int menu;
        String nota, novaNota;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Inserir nota\n" +
                    "2. Remover nota\n" +
                    "3. Alterar nota\n" +
                    "4. Listar todas as notas\n" +
                    "5. Sair"));

            if (menu == 1) {
                nota = JOptionPane.showInputDialog("Digite a nota:");
                bloco.inserirNota(nota);
                JOptionPane.showMessageDialog(null, "Nota inserida com sucesso!");

            } else if (menu == 2) {
                nota = JOptionPane.showInputDialog("Digite a nota para remover:");
                if (bloco.removerNota(nota)) {
                    JOptionPane.showMessageDialog(null, "Nota removida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nota não encontrada!");
                }

            } else if (menu == 3) {
                nota = JOptionPane.showInputDialog("Digite a nota a ser alterada:");
                novaNota = JOptionPane.showInputDialog("Digite a nova nota:");
                if (bloco.alterarNota(nota, novaNota)) {
                    JOptionPane.showMessageDialog(null, "Nota alterada com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Nota não encontrada!");
                }

            } else if (menu == 4) {
                bloco.listarNotas();
            } else if (menu == 5) {
                JOptionPane.showMessageDialog(null, "Saindo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (menu != 5);
    }
}
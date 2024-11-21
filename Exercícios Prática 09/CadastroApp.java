import javax.swing.JOptionPane;

public class CadastroApp {

    public static void main(String[] args) {
        BancoDeClientes bancoDeClientes = new BancoDeClientes();
        int menu;
        String nome, fone;
        int id;

        do {
            menu = Integer.parseInt(JOptionPane.showInputDialog(
                    "1. Inserir cliente\n" +
                    "2. Remover cliente\n" +
                    "3. Alterar cliente\n" +
                    "4. Listar cliente\n" +
                    "5. Listar todos os clientes\n" +
                    "6. Sair"));

            if (menu == 1) {
                nome = JOptionPane.showInputDialog("Nome do cliente:");
                fone = JOptionPane.showInputDialog("Telefone do cliente:");
                id = Integer.parseInt(JOptionPane.showInputDialog("ID do cliente:"));
                Cliente cliente = new Cliente(nome, fone, id);
                bancoDeClientes.adicionarCliente(cliente);

            } else if (menu == 2) {
                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente a ser removido:"));
                if (bancoDeClientes.removerCliente(id)) {
                    JOptionPane.showMessageDialog(null, "Cliente removido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                }

            } else if (menu == 3) {
                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente a ser alterado:"));
                Cliente cliente = bancoDeClientes.buscarClientePorId(id);
                if (cliente != null) {
                    nome = JOptionPane.showInputDialog("Novo nome:", cliente.getNome());
                    fone = JOptionPane.showInputDialog("Novo telefone:", cliente.getFone());
                    cliente.setNome(nome);
                    cliente.setFone(fone);
                    JOptionPane.showMessageDialog(null, "Cliente alterado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                }

            } else if (menu == 4) {
                id = Integer.parseInt(JOptionPane.showInputDialog("Informe o ID do cliente para listar:"));
                Cliente cliente = bancoDeClientes.buscarClientePorId(id);
                if (cliente != null) {
                    JOptionPane.showMessageDialog(null, cliente.toString());
                } else {
                    JOptionPane.showMessageDialog(null, "Cliente não encontrado!");
                }

            } else if (menu == 5) {
                bancoDeClientes.listarTodosClientes();
            } else if (menu == 6) {
                JOptionPane.showMessageDialog(null, "Saindo...");
            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        } while (menu != 6);
    }
}
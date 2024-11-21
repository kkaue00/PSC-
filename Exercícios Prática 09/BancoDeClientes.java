import java.util.ArrayList;

public class BancoDeClientes {
    private ArrayList<Cliente> clientes;

    public BancoDeClientes() {
        clientes = new ArrayList<Cliente>();
    }

    public void inserirCliente(Cliente cliente) {
        clientes.add(cliente);
    }

    public boolean removerCliente(int id) {
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getId() == id) {
                clientes.remove(i);
                return true;
            }
        }
        return false;
    }

    public Cliente buscarCliente(int id) {
        for (Cliente cliente : clientes) {
            if (cliente.getId() == id) {
                return cliente;
            }
        }
        return null;
    }

    public void listarClientes() {
        for (Cliente cliente : clientes) {
            System.out.println(cliente);
        }
    }
}
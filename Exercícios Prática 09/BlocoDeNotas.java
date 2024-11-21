import java.util.ArrayList;

public class BlocoDeNotas {
    private ArrayList<String> notas;

    public BlocoDeNotas() {
        notas = new ArrayList<String>();
    }

    public void inserirNota(String nota) {
        notas.add(nota);
    }

    public boolean removerNota(String nota) {
        return notas.remove(nota);
    }

    public boolean alterarNota(String antiga, String nova) {
        int index = notas.indexOf(antiga);
        if (index != -1) {
            notas.set(index, nova);
            return true;
        }
        return false;
    }

    public void listarNotas() {
        if (notas.isEmpty()) {
            System.out.println("Nenhuma nota registrada.");
        } else {
            for (String nota : notas) {
                System.out.println(nota);
            }
        }
    }
}
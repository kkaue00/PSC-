class Empregado {
    protected String nome;
    protected double salario;

    public Empregado(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public String toString() {
        return "Empregado: " + nome + ", Salário: " + salario;
    }
}

class Mensalista extends Empregado {
    public Mensalista(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "Mensalista: " + nome + ", Salário: " + salario;
    }
}

class Comissionado extends Empregado {
    private double comissao;

    public Comissionado(String nome, double salario, double comissao) {
        super(nome, salario);
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + comissao;
    }

    @Override
    public String toString() {
        return "Comissionado: " + nome + ", Salário base: " + salario + ", Comissão: " + comissao;
    }
}

class Horista extends Empregado {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, double salario, double horasTrabalhadas, double valorHora) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double getSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "Horista: " + nome + ", Salário por hora: " + valorHora + ", Horas trabalhadas: " + horasTrabalhadas;
    }
}

class Tarefeiro extends Empregado {
    private int tarefasCompletadas;
    private double valorPorTarefa;

    public Tarefeiro(String nome, double salario, int tarefasCompletadas, double valorPorTarefa) {
        super(nome, salario);
        this.tarefasCompletadas = tarefasCompletadas;
        this.valorPorTarefa = valorPorTarefa;
    }

    @Override
    public double getSalario() {
        return tarefasCompletadas * valorPorTarefa;
    }

    @Override
    public String toString() {
        return "Tarefeiro: " + nome + ", Valor por tarefa: " + valorPorTarefa + ", Tarefas completadas: " + tarefasCompletadas;
    }
}

public class TesteEmpregados {
    public static void main(String[] args) {
        Empregado mensalista = new Mensalista("José", 3000);
        Empregado comissionado = new Comissionado("Maria", 1500, 500);
        Empregado horista = new Horista("Pedro", 0, 160, 20);
        Empregado tarefeiro = new Tarefeiro("Ana", 0, 10, 100);

        System.out.println(mensalista);
        System.out.println(comissionado);
        System.out.println(horista);
        System.out.println(tarefeiro);
    }
}
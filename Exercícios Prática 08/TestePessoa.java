class PessoaFisica {
    protected String nome;
    protected String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String toString() {
        return "Pessoa Física: " + nome + ", CPF: " + cpf;
    }
}

class Desempregado extends PessoaFisica {
    public Desempregado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String toString() {
        return "Desempregado: " + nome + ", CPF: " + cpf;
    }
}

class Empregado extends PessoaFisica {
    protected double salario;

    public Empregado(String nome, String cpf, double salario) {
        super(nome, cpf);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        return "Empregado: " + nome + ", CPF: " + cpf + ", Salário: " + salario;
    }
}

class Mensalista extends Empregado {
    public Mensalista(String nome, String cpf, double salario) {
        super(nome, cpf, salario);
    }

    @Override
    public String toString() {
        return "Mensalista: " + nome + ", CPF: " + cpf + ", Salário: " + salario;
    }
}

class Comissionado extends Empregado {
    private double comissao;

    public Comissionado(String nome, String cpf, double salario, double comissao) {
        super(nome, cpf, salario);
        this.comissao = comissao;
    }

    @Override
    public double getSalario() {
        return super.getSalario() + comissao;
    }

    @Override
    public String toString() {
        return "Comissionado: " + nome + ", CPF: " + cpf + ", Salário: " + salario + ", Comissão: " + comissao;
    }
}

class Horista extends Empregado {
    private double horasTrabalhadas;
    private double valorHora;

    public Horista(String nome, String cpf, double salario, double horasTrabalhadas, double valorHora) {
        super(nome, cpf, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double getSalario() {
        return horasTrabalhadas * valorHora;
    }

    @Override
    public String toString() {
        return "Horista: " + nome + ", CPF: " + cpf + ", Horas Trabalhadas: " + horasTrabalhadas + ", Valor por Hora: " + valorHora;
    }
}

class Tarefeiro extends Empregado {
    private int tarefasCompletadas;
    private double valorPorTarefa;

    public Tarefeiro(String nome, String cpf, double salario, int tarefasCompletadas, double valorPorTarefa) {
        super(nome, cpf, salario);
        this.tarefasCompletadas = tarefasCompletadas;
        this.valorPorTarefa = valorPorTarefa;
    }

    @Override
    public double getSalario() {
        return tarefasCompletadas * valorPorTarefa;
    }

    @Override
    public String toString() {
        return "Tarefeiro: " + nome + ", CPF: " + cpf + ", Tarefas Completadas: " + tarefasCompletadas + ", Valor por Tarefa: " + valorPorTarefa;
    }
}

public class TestePessoa {
    public static void main(String[] args) {
        PessoaFisica pessoa1 = new Desempregado("Carlos", "123.456.789-00");
        PessoaFisica pessoa2 = new Empregado("Ana", "987.654.321-00", 2500);
        PessoaFisica pessoa3 = new Mensalista("José", "111.222.333-44", 3000);
        PessoaFisica pessoa4 = new Comissionado("Maria", "555.666.777-88", 1500, 500);
        PessoaFisica pessoa5 = new Horista("Pedro", "999.000.111-22", 0, 160, 20);
        PessoaFisica pessoa6 = new Tarefeiro("Ana", "333.444.555-66", 0, 10, 100);

        System.out.println(pessoa1);
        System.out.println(pessoa2);
        System.out.println(pessoa3);
        System.out.println(pessoa4);
        System.out.println(pessoa5);
        System.out.println(pessoa6);
    }
}
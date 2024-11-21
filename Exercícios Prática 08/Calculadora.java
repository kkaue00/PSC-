import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener {
    private JTextField txtDisplay;
    private StringBuilder displayText;
    private int num1, num2, resultado;
    private char operador;

    public Calculadora() {
        super("Calculadora");

        txtDisplay = new JTextField(20);
        txtDisplay.setEditable(false);
        displayText = new StringBuilder();

        JButton btn0 = new JButton("0");
        JButton btn1 = new JButton("1");
        JButton btn2 = new JButton("2");
        JButton btn3 = new JButton("3");
        JButton btn4 = new JButton("4");
        JButton btn5 = new JButton("5");
        JButton btn6 = new JButton("6");
        JButton btn7 = new JButton("7");
        JButton btn8 = new JButton("8");
        JButton btn9 = new JButton("9");
        JButton btnSoma = new JButton("+");
        JButton btnSubtracao = new JButton("-");
        JButton btnMultiplicacao = new JButton("*");
        JButton btnDivisao = new JButton("/");
        JButton btnIgual = new JButton("=");
        JButton btnLimpar = new JButton("C");

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(5, 4, 5, 5));

        painel.add(btn7);
        painel.add(btn8);
        painel.add(btn9);
        painel.add(btnDivisao);
        painel.add(btn4);
        painel.add(btn5);
        painel.add(btn6);
        painel.add(btnMultiplicacao);
        painel.add(btn1);
        painel.add(btn2);
        painel.add(btn3);
        painel.add(btnSubtracao);
        painel.add(btn0);
        painel.add(btnIgual);
        painel.add(btnLimpar);
        painel.add(btnSoma);

        this.add(txtDisplay, BorderLayout.NORTH);
        this.add(painel, BorderLayout.CENTER);

        btn0.addActionListener(this);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        btn4.addActionListener(this);
        btn5.addActionListener(this);
        btn6.addActionListener(this);
        btn7.addActionListener(this);
        btn8.addActionListener(this);
        btn9.addActionListener(this);
        btnSoma.addActionListener(this);
        btnSubtracao.addActionListener(this);
        btnMultiplicacao.addActionListener(this);
        btnDivisao.addActionListener(this);
        btnIgual.addActionListener(this);
        btnLimpar.addActionListener(this);

        setSize(300, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String comando = e.getActionCommand();

        if (comando.charAt(0) >= '0' && comando.charAt(0) <= '9') {
            displayText.append(comando);
            txtDisplay.setText(displayText.toString());
        } else if (comando.equals("+") || comando.equals("-") || comando.equals("*") || comando.equals("/")) {
            if (displayText.length() > 0) {
                num1 = Integer.parseInt(displayText.toString());
                operador = comando.charAt(0);
                displayText.setLength(0);
            }
        } else if (comando.equals("=")) {
            if (displayText.length() > 0) {
                num2 = Integer.parseInt(displayText.toString());

                switch (operador) {
                    case '+':
                        resultado = num1 + num2;
                        break;
                    case '-':
                        resultado = num1 - num2;
                        break;
                    case '*':
                        resultado = num1 * num2;
                        break;
                    case '/':
                        if (num2 != 0) {
                            resultado = num1 / num2;
                        } else {
                            resultado = 0;
                        }
                        break;
                    default:
                        break;
                }
                displayText.setLength(0);
                displayText.append(resultado);
                txtDisplay.setText(displayText.toString());
            }
        } else if (comando.equals("C")) {
            displayText.setLength(0);
            txtDisplay.setText("");
        }
    }

    public static void main(String[] args) {
        new Calculadora();
    }
}
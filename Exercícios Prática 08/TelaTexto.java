import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaTexto implements ActionListener {
    private JTextField txtTexto;
    private JButton btnMostrar, btnLimpar, btnSair;

    public TelaTexto() {
        JFrame frame = new JFrame("Campo Texto");
        frame.setLayout(new FlowLayout());
        frame.setSize(300, 150);
        
        txtTexto = new JTextField(20);
        frame.add(txtTexto);

        btnMostrar = new JButton("Mostrar");
        btnLimpar = new JButton("Limpar");
        btnSair = new JButton("Sair");

        btnMostrar.addActionListener(this);
        btnLimpar.addActionListener(this);
        btnSair.addActionListener(this);

        frame.add(btnMostrar);
        frame.add(btnLimpar);
        frame.add(btnSair);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnMostrar) {
            JOptionPane.showMessageDialog(null, txtTexto.getText(), "Texto", JOptionPane.INFORMATION_MESSAGE);
        } else if (e.getSource() == btnLimpar) {
            txtTexto.setText("");
        } else if (e.getSource() == btnSair) {
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new TelaTexto();
    }
}
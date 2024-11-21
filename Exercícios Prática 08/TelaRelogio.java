import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Relogio {
    private int hora;
    private int minuto;

    public Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public void ticTac() {
        minuto++;
        if (minuto == 60) {
            minuto = 0;
            hora++;
            if (hora == 24) {
                hora = 0;
            }
        }
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public String mostra() {
        return String.format("%02d:%02d", hora, minuto);
    }
}

public class TelaRelogio implements ActionListener {

    private JLabel lblMostrador;
    private JButton btnTicTac, btnHora, btnMinuto;
    private JTextField txtHora, txtMinuto;
    private Relogio relogio;

    public TelaRelogio() {
        JFrame frame = new JFrame("Relógio");
        frame.setLayout(new FlowLayout());

        relogio = new Relogio(0, 0);
        
        lblMostrador = new JLabel(relogio.mostra(), JLabel.CENTER);
        btnTicTac = new JButton("TicTac");
        btnHora = new JButton("Hora");
        btnMinuto = new JButton("Minuto");
        txtHora = new JTextField(2);
        txtMinuto = new JTextField(2);

        frame.add(lblMostrador);
        frame.add(btnTicTac);
        frame.add(new JLabel("Hora (0-23):"));
        frame.add(txtHora);
        frame.add(new JLabel("Minuto (0-59):"));
        frame.add(txtMinuto);
        frame.add(btnHora);
        frame.add(btnMinuto);

        btnTicTac.addActionListener(this);
        btnHora.addActionListener(this);
        btnMinuto.addActionListener(this);

        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == btnTicTac) {
            relogio.ticTac();
            lblMostrador.setText(relogio.mostra());
        } else if (e.getSource() == btnHora) {
            try {
                int hora = Integer.parseInt(txtHora.getText());
                if (hora >= 0 && hora <= 23) {
                    relogio.setHora(hora);
                    lblMostrador.setText(relogio.mostra());
                } else {
                    JOptionPane.showMessageDialog(null, "Hora inválida!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número válido para a hora.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else if (e.getSource() == btnMinuto) {
            try {
                int minuto = Integer.parseInt(txtMinuto.getText());
                if (minuto >= 0 && minuto <= 59) {
                    relogio.setMinuto(minuto);
                    lblMostrador.setText(relogio.mostra());
                } else {
                    JOptionPane.showMessageDialog(null, "Minuto inválido!", "Erro", JOptionPane.ERROR_MESSAGE);
                }
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Digite um número válido para o minuto.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new TelaRelogio();
    }
}
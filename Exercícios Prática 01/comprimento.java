import javax.swing.JOptionPane;

public class comprimento 
{
    public static void main(String[] args) 
    {
        String string1 = JOptionPane.showInputDialog("Digite a primeira String:");
        String string2 = JOptionPane.showInputDialog("Digite a segunda String:");
        String string3 = JOptionPane.showInputDialog("Digite a terceira String:");

        int comprimentoTotal = string1.length() + string2.length() + string3.length();

        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das Strings é: " + comprimentoTotal);
    }
}
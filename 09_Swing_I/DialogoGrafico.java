import javax.swing.JOptionPane;

public class DialogoGrafico 
{
  public static void main(String[] args) 
  {
    String nm = JOptionPane.showInputDialog(null,"Informe seu nome");
    JOptionPane.showMessageDialog(null,nm + ": seja bem-vindo!");
    System.exit(0);
  }
}

import javax.swing.JOptionPane;

public class Resposta 
{
  public static void main(String[] args) 
  {
    String st = "Informe seu nome: ";
    st = JOptionPane.showInputDialog(null,st);
    
    if (st == null) {
      st = "Voc� n�o deve cancelar esse di�logo!";
      JOptionPane.showMessageDialog(null,st,"Erro",2);
      System.exit(0);
    }
    
    if (st.length( ) == 0) {
      st = "Voc� precisa informar seu nome!";
      JOptionPane.showMessageDialog(null,st,"Erro",0);
      System.exit(0);
    }
       
    st = "Nome informado: " + st;
    JOptionPane.showMessageDialog(null,st,"Mensagem",1);
    System.exit(0);
  }
}

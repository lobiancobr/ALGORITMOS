import javax.swing.JOptionPane;

public class Meses 
{
  public static void main(String[] args) 
  {
    String st = "Informe um número entre 1 e 12";
    st = JOptionPane.showInputDialog(null,st);
    byte mes = Byte.parseByte(st);
    
    switch (mes) {
      case 1:
        st = "janeiro";
        break;
      case 2:
        st = "fevereiro";
        break;
      case 3:
        st = "março";
        break;
      case 4:
        st = "abril";
        break;
      case 5:
        st = "maio";
        break;
      case 6:
        st = "junho";
        break;
      case 7:
        st = "julho";
        break;
      case 8:
        st = "agosto";
        break;
      case 9:
        st = "setembro";
        break;
      case 10:
        st = "outubro";
        break;
      case 11:
        st = "novembro";
        break;
      case 12:
        st = "dezembro";
        break;
      default: 
        st = "Mês inválido!";
        JOptionPane.showMessageDialog(null,st,"Erro",0);
        System.exit(0);
    }
    
    st = "Você escolheu o mês de " + st;
    JOptionPane.showMessageDialog(null,st,"Mensagem",1);
    System.exit(0);
  }
}

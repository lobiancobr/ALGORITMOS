import java.util.Random;
import javax.swing.JOptionPane;

public class Codigo 
{
  public static void main(String[] args) 
  {
    char[] caracteres = new char[]{'0','1','2','3','4','5','6','7',
      '8','9','A','B','C','D','E','F','G','H','I','J','K','L','M',
      'N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b',
      'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q',
      'r','s','t','u','v','w','x','y','z','!','@','#','$','%','&'};
    
    String codigo = "";
    Random rdm =  new Random();
    
    for (int i = 1; i <= 8; i++)
      codigo += caracteres[ rdm.nextInt(68) ];
      
    JOptionPane.showMessageDialog(null,codigo);
    System.exit(0);
  }
}

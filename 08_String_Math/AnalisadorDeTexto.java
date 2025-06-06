import java.io.PrintStream;
import java.util.Scanner;

public class AnalisadorDeTexto 
{
  public static void main(String[] args) 
  {
    String artista = "";
    PrintStream saida = System.out;
    
    Scanner scan = new Scanner(System.in);
    saida.print("\nInforme o nome de um artista:\t");
    artista = scan.nextLine();
    
    saida.println("\nAnálise do nome:\t\t" + artista);
    
    saida.print("Conversão para maiúsculo:\t");
    saida.println(artista.toUpperCase());
    
    saida.print("Conversão para minúsculo:\t");
    saida.println(artista.toLowerCase());
    
    saida.print("Substituindo o espaco por '_':\t");
    saida.println(artista.replaceAll(" ","_"));
    
    saida.print("Quantidade de caracteres:\t");
    saida.println(artista.length());
      
    saida.print("A primeira letra:\t\t");
    saida.println(artista.charAt(0));
      
    saida.print("Posição da primeira letra 'a':\t");
    saida.println(artista.indexOf("a"));
    
    saida.print("Posição da última letra 'a':\t");
    saida.println(artista.lastIndexOf("a"));
    
    saida.print("O primeiro nome:\t\t");
    saida.println(artista.substring(0,artista.indexOf(" ")));
    
    saida.print("O último sobrenome:\t\t");
    saida.println(artista.substring(artista.lastIndexOf(" ") + 1,
      artista.length()));
  }
}
import java.util.Scanner;
import java.util.Random;

public class Bingo 
{
   public static void main( String args[] )
   {
      int dezena;
      int opcao=0;
      int bingo[] = new int[76];
      Scanner input = new Scanner(System.in);
      Random R = new Random();

      // limpar o tabuleiro
      for (int i=0; i<76; i++)
         bingo[i]=0;

      System.out.println("BINGO"); 

      // laço do jogo
      while( opcao != 3 )
      {
         System.out.println("1:Sorteia\n2:Lista\n3:FIM\nDIGITE: ");
         opcao = input.nextInt();
         //1.Sorteia
         if(opcao==1)
         {
            // colocar laço FALTA
            dezena = 1 + R.nextInt(75); // 1 a 75
            if(bingo[dezena]==0)
            {
               bingo[dezena]=1;
               i++;
            }
            System.out.printf( "Pedra: %d\n", dezena);            
         }
         //2.Lista
         if(opcao==2)
            listagem(bingo);
      }
   } 
   public static void listagem(int []B)
   {
      char[] letra = "BINGO".toCharArray();
      // mostra números sorteados
      for(int i=1; i<76; i++)
         if(B[i]==1)
            System.out.printf("%c%02d ", letra[(i-1)/15], i);
   }
}
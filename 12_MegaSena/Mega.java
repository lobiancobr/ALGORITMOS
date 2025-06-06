import java.util.Scanner;
import java.util.Random;

public class Mega 
{
   public static void main( String args[] )
   {
      int mega[] = new int[61];
      Random R = new Random();
      int dezena;

      // limpar o tabuleiro
      for (int i=0; i<61; i++)
         mega[i]=0;

      System.out.println("MEGA SENA"); 
   
      for ( int i = 0; i < 6;  )
      {
         dezena = 1 + R.nextInt(60); // 1 a 60
         if(mega[dezena]==0)
         {
            mega[dezena]=1;
            i++;
         }
         //System.out.printf( "%d ", dezena);
      }
      // mostra números sorteados
      for(int i=0; i<61; i++)
         if(mega[i]==1)
            System.out.printf("%02d ",i);
   } 
}
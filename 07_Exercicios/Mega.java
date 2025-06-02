import java.util.Random;

public class Mega 
{
   public static void main( String args[] )
   {
      int mega[] = new int[61];
      int apostas = 6;
      int valor;
      Random random = new Random();

      for (int i=0; i<61; i++) // limpei o vetor
         mega[i] = 0;

      for (int i=0; i<apostas; )
      {
         valor = 1 + random.nextInt(60);
         if (mega[valor] == 0)
         {
            mega[valor] = 1; 
            i++;
         }
      }

      for ( int counter = 0; counter < mega.length; counter++ )
         if (mega[counter] == 1)
            System.out.printf( "%d ", counter );
   } 
}
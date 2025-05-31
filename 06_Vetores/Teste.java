public class Teste
{
   public static void main( String args[] )
   {
      int f[] = new int[10];

      for ( int x = 0; x < f.length; x++ )
         f[x] = x*x - 5*x + 3;

      System.out.printf( "%s%8s\n", "Indice", "Valor" ); 
   
      for ( int x = 0; x < f.length; x++ )
         System.out.printf( "%6d%8d\n", x, f[ x ] );
   } 
}
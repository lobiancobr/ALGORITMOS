public class InitArray3
{
   public static void main( String args[] )
   {
      int array[] = new int[5];

      for ( int counter = 0; counter < array.length; counter++ )
         array[counter] = 2 + 2 * counter;

      System.out.printf( "%s%8s\n", "Indice", "Valor" ); 
   
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%6d%8d\n", counter, array[ counter ] );
   } 
}
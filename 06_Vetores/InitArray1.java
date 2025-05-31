public class InitArray1 
{
   public static void main( String args[] )
   {
      int array[] = new int[5];

      System.out.printf( "%s%8s\n", "Indice", "Valor" ); 
   
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%6d%8d\n", counter, array[ counter ] );
   } 
}
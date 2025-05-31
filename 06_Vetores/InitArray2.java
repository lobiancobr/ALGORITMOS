public class InitArray2
{
   public static void main( String args[] )
   {
      int array[] = { 32, 27, 64, 18, 95, 14, 90, 70, 60, 37 };

      System.out.printf( "%s%8s\n", "Indice", "Valor" ); 
   
      for ( int counter = 0; counter < array.length; counter++ )
         System.out.printf( "%6d%8d\n", counter, array[ counter ] );
   } 
}
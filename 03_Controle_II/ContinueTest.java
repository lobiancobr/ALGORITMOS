public class ContinueTest 
{
   public static void main( String args[] )
   {
      for ( int count = 1; count <= 10; count++ )
      {  
         if ( count == 5 )
            continue;

         System.out.printf( "%d ", count );
      }

      System.out.println( "\nO continue e usado para pular o 5" );
   } 
}
public class BreakTest 
{
   public static void main( String args[] )
   {
      int count;
      
      for ( count = 1; count <= 10; count++ )
      {  
         if ( count == 5 )
            break;

         System.out.printf( "%d ", count );
      }

      System.out.printf( "\nO laco termina com count = %d\n", count );
   }
} 
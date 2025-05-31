public class PassArray 
{
   public static void main( String args[] )
   {
      int array[] = { 1, 2, 3, 4, 5 };
      
      System.out.println( 
         "Efeito de passar por referencia todo vetor:\n" +
         "Os valores na ordem original sao:" );

      for ( int value : array )
         System.out.printf( "   %d", value );
   
      modifyArray( array );
      System.out.println( "\n\nOs valores do vetor modificado sao:" );

      for ( int value : array )
         System.out.printf( "   %d", value );
   
      System.out.printf( 
         "\n\nEfeito de passar o valor de um elemento do vetor:\n" +
         "array[3] antes de modifyElement: %d\n", array[ 3 ] );
   
      modifyElement( array[ 3 ] ); 
      System.out.printf( 
         "array[3] depois de modifyElement: %d\n", array[ 3 ] );
   } 
   
   public static void modifyArray( int array2[] )                
   {                                                             
      for ( int counter = 0; counter < array2.length; counter++ )
         array2[ counter ] *= 2;                                 
   } 
   
   public static void modifyElement( int element )            
   {                                                          
      element *= 2;                                           
      System.out.printf(                                      
         "Valor do elemento em modifyElement: %d\n", element );
   } 
} 
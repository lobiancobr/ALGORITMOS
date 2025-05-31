public class MethodOverload 
{
   public static void main( String args[] )
   {
      System.out.printf( "Quadrado do inteiro 7 e %d\n", square( 7 ));
      System.out.printf( "Quadrado do real 7.5 e %f\n", square( 7.5 ));
   } 
   
   public static int square( int intValue )                               
   {                                                               
      System.out.printf( "\nMetodo chamado com argumento inteiro: %d\n",
         intValue );                                               
      return intValue * intValue;                                  
   } 

   public static double square( double doubleValue )                         
   {                                                                  
      System.out.printf( "\nMetodo chamado com argumento real: %f\n",
         doubleValue );                                               
      return doubleValue * doubleValue;                               
   } 
} 
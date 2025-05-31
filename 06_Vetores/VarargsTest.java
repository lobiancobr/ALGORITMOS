public class VarargsTest 
{
   public static double average(double... numbers)
   {
      double total = 0.0;

      // calcula total utilizando a instru??o for aprimorada
      for ( double d : numbers )              
         total += d;                          

      return total / numbers.length;
   }

   public static void main( String args[] ) 
   {
      double d1 = 10.0;
      double d2 = 20.0;
      double d3 = 30.0;
      double d4 = 40.0;

      System.out.printf( "d1 = %.1f\nd2 = %.1f\nd3 = %.1f\nd4 = %.1f\n\n",
         d1, d2, d3, d4 );

      System.out.printf( "Media de d1 e d2         = %.1f\n", 
         average( d1, d2 )); 
      System.out.printf( "Media de d1, d2 e d3     = %.1f\n", 
         average( d1, d2, d3 ));
      System.out.printf( "Media de d1, d2, d3 e d4 = %.1f\n", 
         average( d1, d2, d3, d4 ));
   } 
}
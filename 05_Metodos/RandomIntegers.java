import java.util.Random;

public class RandomIntegers 
{
   public static void main( String args[] )
   {
      Random randomNumbers = new Random();

      for (int counter = 1; counter <= 20; ++counter)
      {
         int face = 1 + randomNumbers.nextInt(6);
         System.out.print(face + " "); 
      }

      System.out.println();
   }
}
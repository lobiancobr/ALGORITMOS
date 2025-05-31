public class BarChart
{
   public static void main( String args[] )
   {
      int array[] = {0, 0, 0, 0, 0, 0, 1, 2, 4, 2, 1};

      System.out.println("Grade distribution:");

      for (var counter = 0; counter < array.length; ++counter)
      {
         if (counter == 10)
         {
            System.out.print("  100: ");
         }
         else
         {
            System.out.printf("%2d-%2d: ", counter * 10, counter * 10 + 9);
         }

         // display bar of asterisks                             
         for (var stars = 0; stars < array[counter]; ++stars)
         {
            System.out.print("*");
         }

         System.out.println();
      }
   } 
}
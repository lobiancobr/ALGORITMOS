import java.util.Scanner; 

public class GradeBook1 
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );

      int total;
      int gradeCounter;
      int grade; 
      int average; 

      total = 0;
      gradeCounter = 1; 
   
      while ( gradeCounter <= 10 ) 
      {
         System.out.print( "Entre com a nota: " ); 
         grade = input.nextInt();
         total = total + grade; 
         gradeCounter = gradeCounter + 1; 
      }

      average = total / 10; 
      
      System.out.printf( "\nTotal de 10 notas e %d\n", total );
      System.out.printf( "Media da classe e %d\n", average );
   } 
} 


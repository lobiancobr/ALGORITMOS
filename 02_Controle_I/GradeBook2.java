import java.util.Scanner;

public class GradeBook2
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner( System.in );

      int total;
      int gradeCounter;
      int grade; 
      double average; 
      
      total = 0; 
      gradeCounter = 0; 

      System.out.print( "Digite a nota ou -1 para terminar: " );
      grade = input.nextInt();                          

      while ( grade != -1 ) 
      {
         total = total + grade; 
         gradeCounter = gradeCounter + 1; 

         System.out.print( "Digite a nota ou -1 para terminar: " );
         grade = input.nextInt();                          
      } 

      if ( gradeCounter != 0 ) 
      {
         average = (double) total / gradeCounter;  

         System.out.printf( "\nTotal de %d notas digitadas e %d\n", 
            gradeCounter, total );
         System.out.printf( "Media da classe %.2f\n", average ); 
      } 
      else 
         System.out.println( "Nenhuma nota digitada" ); 
   } 
}


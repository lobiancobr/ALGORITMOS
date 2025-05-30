import java.util.Scanner;

public class GradeBook 
{
   private String courseName;
   private int total;
   private int gradeCounter;
   private int aCount;
   private int bCount;
   private int cCount;
   private int dCount;
   private int fCount;
   
   public void inputGrades()
   {
      Scanner input = new Scanner( System.in );

      int grade; 

      System.out.printf( "%s\n%s\n   %s\n   %s\n", 
         "Digite notas inteiras entre 0-100.", 
         "Digite o fim-de-linha correspondente para terminar:", 
         "No UNIX/Linux/Mac OS X digite <ctrl> d e depois Enter",
         "No Windows digite <ctrl> z e depois Enter" );

      while (input.hasNext()) 
      {
         grade = input.nextInt();
         total += grade;
         ++gradeCounter; 
         
         incrementLetterGradeCounter( grade );
      } 
   } 

   public void incrementLetterGradeCounter( int grade )
   {
      switch ( grade / 10 )                            
      {                                                
         case 9:  // nota estava entre 90              
         case 10: // e 100                           
            ++aCount; // incrementa aCount              
            break; // necessario para sair de switch         
                                                       
         case 8: // nota estava entre 80 e 89        
            ++bCount; // incrementa bCount              
            break; // sai do switch                      
                                                       
         case 7: // nota estava entre 70 e 79        
            ++cCount; // incrementa cCount              
            break; // sai do switch                      
                                                       
         case 6: // nota estava entre 60 e 69        
            ++dCount; // incrementa dCount              
            break; // sai de switch                      
                                                       
         default: // nota era menor que 60            
            ++fCount; // incrementa fCount               
            break; // opcional; saira de switch de qualquer jeito
      } // fim do switch                                                                    
   } 

   public void displayGradeReport()
   {
      System.out.println( "\nRelatorio de Notas:" );

      if ( gradeCounter != 0 ) 
      {
         double average = (double) total / gradeCounter;  

         System.out.printf( "Total das %d notas digitadas e %d\n", 
            gradeCounter, total );
         System.out.printf( "Media da Classe e %.2f\n", average );
         System.out.printf( "%s\n%s%d\n%s%d\n%s%d\n%s%d\n%s%d\n", 
            "Numero de estudantes que receberam cada nota:", 
            "A: ", aCount, 
            "B: ", bCount,
            "C: ", cCount,
            "D: ", dCount,
            "F: ", fCount );
      } // fim do if
      else // nenhuma nota foi inserida, assim gera a saida da mensagem apropriada
         System.out.println( "Nenhuma nota foi inserida" );
   } 
} 
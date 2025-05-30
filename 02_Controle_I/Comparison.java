import java.util.Scanner;

public class Comparison
{
   public static void main( String args[] )
   {
      Scanner input = new Scanner(System.in);

      int number1;          // primeiro numero a comparar
      int number2;          // segundo numero a comparar

      System.out.print("Digite o primeiro numero: ");
      number1 = input.nextInt();
      System.out.print("Digite o segundo numero: ");
      number2 = input.nextInt();

      if ( number1 == number2 )
         System.out.printf("%s == %s\n", number1, number2);
      if ( number1 != number2 )
         System.out.printf("%s != %s\n", number1, number2);
      if ( number1 < number2 )
         System.out.printf("%s < %s\n", number1, number2);
      if ( number1 > number2 )
         System.out.printf("%s > %s\n", number1, number2);
   }
}

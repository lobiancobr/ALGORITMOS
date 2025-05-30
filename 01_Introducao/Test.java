import java.util.Scanner;

public class Test
{
   public static void main(String args[])
   {
      // cria um objeto Scanner para ler o teclado
      Scanner input = new Scanner(System.in);
        
      System.out.print("Digite a nota 1: ");
      double nota1 = input.nextDouble();
        
      System.out.print("Digite a nota 2: ");
      double nota2 = input.nextDouble();
        
      System.out.print("Digite a nota 3: ");
      double nota3 = input.nextDouble();
        
      double media = (nota1 + nota2 + nota3) / 3;
        
      System.out.printf("A media e: %.2f\n", media);
        
      // TESTES MANUAIS
      // Caso 1: 7, 8, 9 → Esperado: 8.00
      // Caso 2: 5.5, 6.5, 7.5 → Esperado: 6.50
      // Caso 3: 10, 10, 10 → Esperado: 10.00
      // Caso 4: 0, 0, 0 → Esperado: 0.00   
      // Caso 5: -1, 1, 3 → Esperado: 1.00
      // Caso 6: 5.8, 6.6, 7.7 → Esperado: 6.70
   }
}

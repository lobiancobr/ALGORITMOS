public class LogicalOperators 
{
   public static void main( String args[] )
   {
      // cria a tabela-verdade para o operador && (E condicional) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional AND (&&)", "false && false",  ( false && false ),
         "false && true",  ( false && true ), 
         "true && false",  ( true && false ),
         "true && true",  ( true && true ));

      // cria a tabela-verdade para o operador || (OU condicional) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Conditional OR (||)", "false || false",  ( false || false ),
         "false || true",  ( false || true ),
         "true || false",  ( true || false ),
         "true || true",  ( true || true ));

      // cria a tabela-verdade para o operador & (E l?gico booleano) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical AND (&)", "false & false",  ( false & false ),
         "false & true",  ( false & true ),
         "true & false",  ( true & false ),
         "true & true",  ( true & true ));

      // cria a tabela-verdade para | (OU inclusivo l?gico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical inclusive OR (|)",
         "false | false",  ( false | false ),
         "false | true",  ( false | true ),
         "true | false",  ( true | false ),
         "true | true",  ( true | true ));

      // cria a tabela-verdade para ^ (OU exclusivo l?gico booleano)
      System.out.printf( "%s\n%s: %b\n%s: %b\n%s: %b\n%s: %b\n\n",
         "Boolean logical exclusive OR (^)", 
         "false ^ false",  ( false ^ false ),
         "false ^ true",  ( false ^ true ),
         "true ^ false",  ( true ^ false ),
         "true ^ true",  ( true ^ true ));

      // cria a tabela-verdade para ! (nega??o l?gica) 
      System.out.printf( "%s\n%s: %b\n%s: %b\n", "Logical NOT (!)",
         "!false",  ( !false ), "!true", ( ! true) );
   }
}
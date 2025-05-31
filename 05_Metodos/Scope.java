public class Scope
{
   // atributo acessivel para todos os metodos dessa classe
   private static int x = 1;                                      

   // metodo begin cria e inicializa a variavel local x
   // e chama os metodos useLocalVariable e useField
   public static void main( String args[] )
   {
      int x = 5; // variavel local x do metodo sombreia o atributo x

      System.out.printf( "variavel local x no metodo begin e %d\n", x );

      useLocalVariable(); // useLocalVariable tem uma variavel local x
      useField(); // useField utiliza o atributo x da classe Scope
      useLocalVariable(); // useLocalVariable reinicializa a variavel local x
      useField(); // atributo x da classe Scope retem seu valor

      System.out.printf( "\nvariavel local x no metodo begin e %d\n", x );
   } // fim do metodo begin

   // cria e inicializa a variavel local x durante cada chamada
   public static void useLocalVariable()
   {
      int x = 25; // inicializada toda vez que useLocalVariable e chamado

      System.out.printf( 
         "\nvariavel local x ao entrar no metodo useLocalVariable e %d\n", x );
      ++x; // modifica a variavel local x desse metodo
      System.out.printf( 
         "variavel local x antes de sair do metodo useLocalVariable e %d\n", x );
   } // fim do metodo useLocalVariable

   // modifica o atributo x da classe Scope durante cada chamada
   public static void useField()
   {
      System.out.printf( 
         "\natributo x ao entrar no metodo useField e %d\n", x );
      x *= 10; // modifica o atributo x da classe Scope
      System.out.printf( 
         "atributo x antes de sair do metodo useField e %d\n", x );
   } // fim do metodo useField
} // fim da classe Scope
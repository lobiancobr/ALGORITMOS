import java.util.Random;

public class Craps 
{
   // cria um gerador de numeros aleatarios para uso no metodo rollDice
   private static Random randomNumbers = new Random(); 

   // enumeracao com constantes que representam o status do jogo
   private enum Status { CONTINUE, WON, LOST };                

   // constantes que representam lancamentos comuns dos dados
   private final static int SNAKE_EYES = 2;
   private final static int TREY = 3;      
   private final static int SEVEN = 7;     
   private final static int YO_LEVEN = 11;
   private final static int BOX_CARS = 12;

   // joga uma partida de craps
   public static void main( String args[] )
   {
      int myPoint = 0; // pontos se nao ganhar ou perder na 1a. rolagem
      Status gameStatus; // pode conter CONTINUE, WON ou LOST

      int sumOfDice = rollDice(); // primeira rolagem dos dados

      // determina status do jogo e pontuacao baseado no 1o lancamento
      switch ( sumOfDice ) 
      {
         case SEVEN: // ganha com 7 no primeiro lancamento
         case YO_LEVEN: // ganha com 11 no primeiro lancamento
            gameStatus = Status.WON;
            break;
         case SNAKE_EYES: // perde com 2 no primeiro lancamento
         case TREY: // perde com 3 no primeiro lancamento
         case BOX_CARS: // perde com 12 no primeiro lancamento
            gameStatus = Status.LOST;
            break;
         default: // nao ganhou nem perdeu, portanto registra a pontuacao
            gameStatus = Status.CONTINUE; // jogo nao terminou
            myPoint = sumOfDice; // informa a pontuacao
            System.out.printf( "O ponto e %d\n", myPoint );
            break; // opcional no final do switch
      } // switch final

      // enquanto o jogo nao estiver completo
      while (gameStatus == Status.CONTINUE) // nem WON nem LOST
      { 
         sumOfDice = rollDice(); // lanca os dados novamente

         // determina o status do jogo
         if ( sumOfDice == myPoint ) // vitoria por pontuacao
            gameStatus = Status.WON;
         else
            if ( sumOfDice == SEVEN ) // perde obtendo 7
               gameStatus = Status.LOST;
      } // fim do while

      // exibe uma mensagem ganhou ou perdeu
      if (gameStatus == Status.WON)
         System.out.println( "Jogador ganha" );
      else
         System.out.println( "Jogador perde" );
   } // fim do metodo play

   // lanca os dados, calcula a soma e exibe os resultados
   public static int rollDice()
   {
      // seleciona valores aleatorios do dado
      int die1 = 1 + randomNumbers.nextInt( 6 ); // primeiro lancamento
      int die2 = 1 + randomNumbers.nextInt( 6 ); // segundo lancamento

      int sum = die1 + die2; // soma dos valores dos dados

      // exibe os resultados desse lancamento
      System.out.printf( "Jogador conseguiu %d + %d = %d\n", 
         die1, die2, sum );

      return sum; // retorna a soma dos dados
   } // fim do metodo rollDice
} // fim da classe Craps
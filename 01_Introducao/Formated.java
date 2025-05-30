// Programa: Formated.java
// Escrito por: xxx
// Data de criação: 01-01-2022
// Propósito: Demonstrar formatações diversas usando printf

public class Formated {
    public static void main(String[] args) {
        // Exemplos de operações e formatações
        System.out.printf("R       = %d\n", 4 - (5 - 17) / (2 * 3)); 
        System.out.printf("7 / 2   = %d\n", 7 / 2); // Divisão inteira
        // Resto divisão (%% para imprimir % em printf)
        System.out.printf("7 %% 2   = %d\n", 7 % 2); 
        System.out.printf("letra   = %c\n", 'f'); // Caracter
        System.out.printf("palavra = %s\n", "Java"); // String
        // Número real padrão
        System.out.printf("Real    = %f\n", 6.78 / 1.75); 
        // Real com 2 casas decimais
        System.out.printf("Real    = %.2f\n", 6.78 / 1.75); 
    }  // Fim do método main
}  // Fim da classe Formated

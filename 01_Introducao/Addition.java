// Programa: Addition.java
// Escrito por: xxx
// Data de criação: 01-01-2022
// Propósito: Demonstrar entrada de dados e soma de dois números inteiros

import java.util.Scanner; // Importa classe Scanner para entrada de dados

public class Addition {
    public static void main(String[] args) {
        // Cria um objeto Scanner para ler o teclado
        Scanner input = new Scanner(System.in);

        int number1; // Primeiro número a somar
        int number2; // Segundo número a somar
        int sum;     // Soma de number1 e number2

        // Solicita o primeiro número ao usuário
        System.out.print("Digite o primeiro número: ");
        number1 = input.nextInt(); // Lê o primeiro número

        // Solicita o segundo número ao usuário
        System.out.print("Digite o segundo número: ");
        number2 = input.nextInt(); // Lê o segundo número

        // Calcula a soma dos dois números
        sum = number1 + number2;

        // Exibe o resultado da soma
        System.out.printf("A soma é %d\n", sum);
    }  // Fim do método main
}  // Fim da classe Addition

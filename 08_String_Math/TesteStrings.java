// Classe para testes de strings, como emails e telefones
public class TesteStrings {

    // Metodo para validar email usando expressoes regulares
    public boolean validarEmail(String email) {
        // Expressao regular para validar formato de email
        String regex = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
        return email.matches(regex);
    }

    // Metodo para validar telefone usando expressoes regulares
    public boolean validarTelefone(String telefone) {
        // Expressao regular para validar formato de telefone (apenas numeros e opcionalmente hifen)
        String regex = "^\\d{2,3}-?\\d{4,5}-?\\d{4}$";
        return telefone.matches(regex);
    }

    // Metodo para executar testes com uma lista de valores
    public void executarTestes() {
        // Lista de emails para teste
        String[] emailsParaTeste = {
            "usuario@example.com", // valido
            "usuario.nome@example.com", // valido
            "usuario.name123@example.co.uk", // valido
            "usuario@.com", // invalido
            "usuario@com", // invalido
            "@example.com" // invalido
        };

        // Lista de telefones para teste
        String[] telefonesParaTeste = {
            "11-98765-4321", // valido
            "11987654321", // valido
            "9876-54321", // valido
            "11-9876-54321", // invalido
            "abc-defg-hijk", // invalido
            "123456789" // invalido
        };

        // Testando emails
        System.out.println("Testando emails:");
        for (String email : emailsParaTeste) {
            boolean resultado = validarEmail(email);
            System.out.println("Email: " + email + " -> Valido: " + resultado);
        }

        // Testando telefones
        System.out.println("\nTestando telefones:");
        for (String telefone : telefonesParaTeste) {
            boolean resultado = validarTelefone(telefone);
            System.out.println("Telefone: " + telefone + " -> Valido: " + resultado);
        }
    }

    // Metodo principal para executar os testes
    public static void main(String[] args) {
        TesteStrings teste = new TesteStrings();
        teste.executarTestes();
    }
}
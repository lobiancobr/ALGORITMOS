import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import javax.swing.JOptionPane;

public class CsvPopulator {

    private static final String filePath = "registros.csv";
    private static final String[] nomes = {
        "Alice", "Bruno", "Carla", "Daniel", "Elisa", "Fernando", "Gabriela",
        "Henrique", "Isabela", "João", "Karen", "Leonardo", "Marina", "Nicolas",
        "Olivia", "Pedro", "Quintino", "Renata", "Samuel", "Tatiana", "Ulisses",
        "Vera", "Wesley", "Xavier", "Yara", "Zeca"
    };
    private static final String[] sobreNomes = {
        "Barboza", "Almeida", "Cardozo", "Duarte", "Silva", "Moura", "Gomes",
        "Alves", "Andrade", "Barros", "Batista", "Borges", "Campos", "Carvalho",
        "Castro", "Costa", "Dias", "Freitas", "Fernandes", "Gonçalves", "Lima",
        "Lopes", "Machado", "Marques", "Medeiros", "Mendes"
    };    
    private static final String[] cidades = {
        "São Paulo", "Rio de Janeiro", "Belo Horizonte", "Curitiba", "Porto Alegre",
        "Salvador", "Fortaleza", "Brasília", "Manaus", "Recife"
    };

    public static void popularArquivoCsv() {
        Random random = new Random();

        try (FileWriter writer = new FileWriter(filePath, true)) {
            for (int i = 0; i < 50; i++) {
                String nome = nomes[random.nextInt(nomes.length)]+' '+sobreNomes[random.nextInt(sobreNomes.length)];
                int idade = random.nextInt(63) + 18; // Idade entre 18 e 80
                String cidade = cidades[random.nextInt(cidades.length)];

                writer.append(nome).append(",")
                      .append(String.valueOf(idade)).append(",")
                      .append(cidade).append("\n");
            }
            JOptionPane.showMessageDialog(null, "50 registros aleatórios adicionados com sucesso!");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro ao gravar no arquivo.");
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        popularArquivoCsv(); // Chama a função para popular o arquivo
    }
}

package pesquisaatendimento;

/**
 *
 * @author beatris
 */
import java.util.Scanner;

public class PesquisaAtendimento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int excelente = 0;
        int ruim = 0;
        
        // Loop para realizar a pesquisa com 50 entrevistados
        for (int i = 1; i <= 50; i++) {
            System.out.println("Entrevistado " + i);
            
            // Coleta o nome do entrevistado
            System.out.print("Digite o nome: ");
            String nome = scanner.nextLine();
            
            // Coleta a idade do entrevistado
            System.out.print("Digite a idade: ");
            int idade = scanner.nextInt();
            
            // Coleta a opinião do entrevistado
            System.out.println("Qual sua opiniao sobre o atendimento? (1-EXCELENTE, 2-BOM, 3-RUIM)");
            int opiniao = scanner.nextInt();
            
            // Verifica a opinião e atualiza as contagens
            if (opiniao == 1) {
                excelente++;
            } else if (opiniao == 3) {
                ruim++;
            }
            
            scanner.nextLine();
        }

        // Exibir os resultados
        System.out.println("\nResultados da Pesquisa:");
        System.out.println("Quantidade de respostas 'EXCELENTE': " + excelente);
        System.out.println("Quantidade de respostas 'RUIM': " + ruim);
    }
}
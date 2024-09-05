import java.util.Scanner;

public class contadorLetra {
    public static void main(String[] args) {
        // Cria o objeto Scanner para capturar a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário que insira uma string
        System.out.println("Digite uma string:");
        String input = scanner.nextLine();

        // Inicializa a variável para contar a quantidade de letras 'a' ou 'A'
        int contagem = 0;

        // Percorre cada caractere da string
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            // Verifica se o caractere é 'a' ou 'A'
            if (c == 'a' || c == 'A') {
                contagem++;
            }
        }

        // Verifica se a letra 'a' foi encontrada
        if (contagem > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) ocorre " + contagem + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        // Fecha o Scanner
        scanner.close();
    }
}


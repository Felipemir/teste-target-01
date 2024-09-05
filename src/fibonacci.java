import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class fibonacci{

    public static void main(String[] args) {
        // Gerador de números aleatórios
        Random random = new Random();

        // Gera um tamanho aleatório entre 5 e 12
        int length = random.nextInt(8) + 5; // valores entre 5 e 12

        // Gera a sequência de Fibonacci
        ArrayList<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(0); // Primeiro número da sequência
        fibonacci.add(1); // Segundo número da sequência

        for (int i = 2; i < length; i++) {
            int nextNumber = fibonacci.get(i - 1) + fibonacci.get(i - 2);
            fibonacci.add(nextNumber);
        }

        // Exibe a sequência gerada até o penúltimo número
        System.out.println("Sequência de Fibonacci gerada:");
        for (int i = 0; i < fibonacci.size() - 1; i++) {
            System.out.print(fibonacci.get(i) + " ");
        }

        // Pergunta ao usuário o último número da sequência
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nQual é o próximo número da sequência?");
        int userAnswer = scanner.nextInt();

        // Verifica se a resposta do usuário está correta
        int correctAnswer = fibonacci.get(fibonacci.size() - 1);
        if (userAnswer == correctAnswer) {
            System.out.println("Parabéns! Você acertou.");
        } else {
            System.out.println("Resposta incorreta. O número correto era: " + correctAnswer);
        }

        scanner.close();
    }
}
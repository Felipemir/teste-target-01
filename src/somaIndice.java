public class somaIndice {
    public static void main(String[] args) {
        int INDICE = 12, SOMA = 0, K = 1;

        // Enquanto K for menor que o INDICE, executa o loop
        while (K < INDICE) {
            K = K + 1;
            SOMA = SOMA + K;
        }

        // Imprime o valor final de SOMA
        System.out.println("O valor final de SOMA é: " + SOMA);
    }
}

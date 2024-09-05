import java.util.Scanner;

public class lampada {
    public static void main(String[] args) {
        // Criar um array para representar o estado das lâmpadas
        int[] lampadas = {0, 0, 0};

        // Simulação de interruptores
        boolean[] interruptores = {false, false, false};

        // Simulação passo a passo
        Scanner scanner = new Scanner(System.in);

        System.out.println("Passo 1: Ligar o primeiro interruptor por 10 minutos (lampada aquece).");
        interruptores[0] = true; // O primeiro interruptor é ligado
        lampadas[0] = 1; // Primeira lâmpada ligada

        System.out.println("Aguarde 10 minutos...");
        // Simulamos o calor residual da lâmpada
        lampadas[0] = 2; // Lampada aquecida

        System.out.println("Passo 2: Desligar o primeiro interruptor e ligar o segundo.");
        interruptores[0] = false; // Primeiro interruptor é desligado
        interruptores[1] = true;  // Segundo interruptor é ligado
        lampadas[1] = 1; // Segunda lâmpada ligada
        lampadas[0] = 2; // Primeira lâmpada agora está desligada e quente

        // Simulação da terceira lâmpada, que nunca foi ligada
        lampadas[2] = 0; // Terceira lâmpada desligada e fria

        System.out.println("Agora, vá verificar as lâmpadas...");

        // Simulando o resultado da verificação
        for (int i = 0; i < 3; i++) {
            if (lampadas[i] == 1) {
                System.out.println("Lampada " + (i + 1) + " está LIGADA. Controlada pelo segundo interruptor.");
            } else if (lampadas[i] == 2) {
                System.out.println("Lampada " + (i + 1) + " está DESLIGADA mas QUENTE. Controlada pelo primeiro interruptor.");
            } else {
                System.out.println("Lampada " + (i + 1) + " está DESLIGADA e FRIA. Controlada pelo terceiro interruptor.");
            }
        }

        scanner.close();
    }
}


public class sequencia {
    public static void main(String[] args) {
        // Sequência a)
        int[] sequenciaA = {1, 3, 5, 7};
        System.out.println("Próximo número da sequência a): " + (sequenciaA[sequenciaA.length - 1] + 2));

        // Sequência b)
        int[] sequenciaB = {2, 4, 8, 16, 32, 64};
        System.out.println("Próximo número da sequência b): " + (sequenciaB[sequenciaB.length - 1] * 2));

        // Sequência c)
        int[] sequenciaC = {0, 1, 4, 9, 16, 25, 36};
        int proximoC = (sequenciaC.length) * (sequenciaC.length); // Próximo quadrado perfeito
        System.out.println("Próximo número da sequência c): " + proximoC);

        // Sequência d)
        int[] sequenciaD = {4, 16, 36, 64};
        int proximoD = ((sequenciaD.length + 1) * 2) * ((sequenciaD.length + 1) * 2); // Próximo quadrado perfeito de número par
        System.out.println("Próximo número da sequência d): " + proximoD);

        // Sequência e)
        int[] sequenciaE = {1, 1, 2, 3, 5, 8};
        int proximoE = sequenciaE[sequenciaE.length - 1] + sequenciaE[sequenciaE.length - 2]; // Próximo número de Fibonacci
        System.out.println("Próximo número da sequência e): " + proximoE);

        // Sequência f)

        int[] sequenciaF = {2, 10, 12, 16, 17, 18, 19};
        int proximoF = 20; // Continuando os números consecutivos
        System.out.println("Próximo número da sequência f): " + proximoF);
    }
}

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int totalNotas = 0;


        //Laço de repetição com o while, parando somente quando o usuario digitar o code de encerramento
        while (nota != -1){
            System.out.println("Digite sua avaliacao para o filme ou -1 para encerrar o programa");
            nota = leitura.nextDouble();

            if (nota != -1){
                mediaAvaliacao += nota;
                totalNotas++;
            }

        }

        System.out.println("media de avaliações: " + mediaAvaliacao / totalNotas);


        // Fori laço de repetição utilizando o for e o contador
        for (int i = 0; i < 4; i++) {
            System.out.println("Digite sua avaliacao do ultimo filme!");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media do ultimo filme: " + mediaAvaliacao/4);
    }
}

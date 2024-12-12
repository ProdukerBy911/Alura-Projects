import java.sql.SQLOutput;
import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura =  new Scanner(System.in);

        System.out.println("Digite seu filme favorito!");
        String filme = leitura.nextLine();
        System.out.println("Avalie o filme entre 0 a 10 !");
        double avaliacao = leitura.nextDouble();

        System.out.println("Selecionando:  " + filme);
        System.out.println("Filme avaliado: " + avaliacao);
    }
}

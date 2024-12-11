//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Bem vindo ao AxelFlix!");
        System.out.println("Filme: As branquelas");

        int anoDeLancamento = 2014;
        System.out.println("Ano de lançamento do filme " + anoDeLancamento);
        boolean incluidoNoPlano = true;
        double notaFilme = 7.4;

        double media = (8.4 + 3.6 + 6.0)/3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Dois agentes se disfarção em uma missão para
                 apreender um leilão de armas e pessoal ilegal,
                 mas durante a investigação os agentes se mentem em varias enrascadas!
                """;

        System.out.println(sinopse);
    }
}
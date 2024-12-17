import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner read = new Scanner(System.in);
     String nome = "Gusman Eucariontes";
     String tipoConta = " Corrente";
     double Saldo = 0;
     int opcao = 0;
     double valorDeTransferencia = 0;

        System.out.println("################################################");
        System.out.println("\n Nome do cliente: " + nome);
        System.out.println("\n Tipo de conta: " + tipoConta);
        System.out.println("\n Saldo atual do cliente: " + Saldo);
        System.out.println("\n ################################################");


        String menu = """
                Selecione uma das opções abaixo:
                
                | 1 - Consultar Saldo  |
                | 2 - Tranferir Valor  |
                | 3 - Receber Valor    | 
                | 4 - Sair             |
                
                """;


        while (opcao != 4) {
            System.out.println(menu);
            opcao = read.nextInt();

            if (opcao == 1) {
                System.out.println("Saldo atual do cliente: " + Saldo);
            } else if (opcao == 2) {
                System.out.println("Digite o valor da transferencia: ");
                valorDeTransferencia = read.nextInt();
                if (valorDeTransferencia > Saldo) {
                    System.out.println("Saldo insulficiente, verifique o valor da transferencia!");
                } else {
                    Saldo -= valorDeTransferencia;
                }
            } else if (opcao == 3) {
                System.out.println("Valor recebido: ");
                double valorRecebido = read.nextDouble();
                Saldo += valorRecebido;
                System.out.println("Novo saldo: " + Saldo);
            } else if (opcao != 4) {
                System.out.println("opção invalida, verifique o numero da opção!");
            }

        }

    }
}
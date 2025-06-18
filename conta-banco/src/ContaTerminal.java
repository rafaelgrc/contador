import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        // Exibir mensagem de boas-vindas
        System.out.println("Bem-vindo ao BootBank!");
        System.out.println("Por favor, preencha os dados da conta:");

        // Solicitar o número da agência
        System.out.print("Número da agência: ");
        String numeroAgencia = scanner.next();

        // Solicitar o número da conta
        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // consome a quebra de linha pendente

        // Solicitar o nome do cliente
        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine(); // permite nome completo

        // Solicitar o saldo da conta
        System.out.print("Saldo da conta: ");
        String saldoTexto = scanner.next().replace(",", "."); // troca vírgula por ponto
        double saldoConta = Double.parseDouble(saldoTexto); // converte para double

        // Exibir os dados da conta
        System.out.println("\nDados da conta:");
        System.out.println("Número da conta: " + numeroConta);
        System.out.println("Número da agência: " + numeroAgencia);
        System.out.println("Nome do cliente: " + nomeCliente);
        System.out.println("Saldo da conta: R$ " + saldoConta);

        // Encerramento
        System.out.println("Obrigado por utilizar o BootBank!");

        scanner.close();
    }
}
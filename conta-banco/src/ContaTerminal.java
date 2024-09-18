import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digitar o número da sua agência: ");

        String agencia = scanner.nextLine();

        System.out.println("Por favor, digitar o número da sua conta: ");

        String numeroConta = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome: ");

        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo inicial da sua conta: ");

        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta com nosso banco,sua agência é "
                + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();

    }
}

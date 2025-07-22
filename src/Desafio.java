import java.math.BigDecimal;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Bruno Nobre";
        String tipoConta = "Conta Corrente";
        BigDecimal saldo = new BigDecimal("1599.99");
        int opcaoMenu = 0;


        Scanner scanner = new Scanner(System.in);


        System.out.println("****************************************");
        System.out.println("Nome do cliente: " + nome);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo atual: " + saldo);
        System.out.println("****************************************");
        while (opcaoMenu != 4) {

            System.out.println("\nOperações:");
            System.out.println("\n1- Consultar valores");
            System.out.println("2- Receber valor");
            System.out.println("3- Retirar valor");
            System.out.println("4- Sair");
            System.out.println("\nDigite a opção desejada: ");
            opcaoMenu = scanner.nextInt();

            BigDecimal valor;
            switch (opcaoMenu) {
                case 1:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    System.out.println("Digite o valor a depositar: ");
                    valor = scanner.nextBigDecimal();
                    saldo = saldo.add(valor);
                    System.out.print("\nValor depositado com sucesso!\n");
                    System.out.println("Saldo atual: R$" + saldo);
                    break;
                case 3:
                    System.out.println("Digite o valor a retirado: ");
                    valor = scanner.nextBigDecimal();
                    if (saldo.compareTo(valor) < 0) {
                        System.out.println("Saldo insuficiente!");
                    } else {
                        saldo = saldo.subtract(valor);
                        System.out.print("\nValor retirado com sucesso!\n");
                        System.out.println("Saldo atual: R$" + saldo);
                    }
                    break;
                case 4:
                    System.out.println("Operações finalizadas! Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente!");

            }
        }
    }
}

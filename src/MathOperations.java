import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.printf("Qual operação deseja fazer? ( opções: + - / * ): ");

        var operation = sc.nextLine();
        if (!operation.matches("[-+*/]")) {
            System.out.println("Operação desconhecida");
            return;
        }

        System.out.println("Informe o primeiro número.");
        var value1 = sc.nextInt();
        sc.nextLine();

        System.out.println("Informe o segundo número.");
        var value2 = sc.nextInt();
        sc.nextLine();

        if ("+".equals(operation)) {
            System.out.printf("Soma: %d", value1 + value2);
        }

        if ("-".equals(operation)) {
            System.out.printf("Subtração: %d", value1 - value2);
        }

        if ("*".equals(operation)) {
            System.out.printf("Multiplação: %d", value1 * value2);
        }

        if ("/".equals(operation)) {
            System.out.printf("Divisão: %.2f", (double) value1 / value2);
        }
    }
}

import java.util.Scanner;

public class SumArgs {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var value1 = 0.0;
        var value2 = 0.0;

        if (args.length == 2) {
            value1 = Double.parseDouble(args[0]);
            value2 = Double.parseDouble(args[1]);

            sum(value1, value2);
            return;
        }

        if (args.length == 1) {
            value1 = Double.parseDouble(args[0]);

            System.out.printf("Informe um valor: ");
            value2 = sc.nextDouble();
            sc.nextLine();

            sum(value1, value2);
            return;
        }

        System.out.printf("Informe o primeiro valor: ");
        value1 = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Informe o segundo valor: ");
        value2 = sc.nextDouble();
        sc.nextLine();

        sum(value1, value2);
    }

    static private void sum (double value1, double value2) {
        var sum = value1 + value2;
        System.out.printf("Soma: %.2f", sum );
    }
}

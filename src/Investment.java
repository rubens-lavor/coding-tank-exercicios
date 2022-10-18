import java.math.BigDecimal;
import java.util.Scanner;

public class Investment {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inicial investido em R$: ");
        var initialValue = sc.nextBigDecimal();

        System.out.print("Informe o juros ao mês em %: ");
        var interestPerMonth = sc.nextDouble();

        System.out.print("Informe o tempo em meses que o dinheiro ficará investido: ");
        var months = sc.nextInt();

        System.out.printf("\n%.2f reais com %.2f%% de juros ao mês por %d meses \n\n", initialValue, interestPerMonth, months);

        var amount = initialValue;
        var interestBalance = BigDecimal.valueOf(0.0);

        for (int i = 1; i <= months ; i++) {
            interestBalance = calculateInterestBalance(interestPerMonth, amount);
            amount = amount.add(interestBalance);

            System.out.printf("Mês %d: Juros: %.2f, saldo: %.2f \n", i, interestBalance, amount);
        }

    }

    private static BigDecimal calculateInterestBalance(double interestPerMonth, BigDecimal amount) {
        return amount.multiply(BigDecimal.valueOf(interestPerMonth / 100));
    }
}

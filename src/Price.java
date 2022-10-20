import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class Price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do empréstimo: ");
        var value = sc.nextBigDecimal();

        System.out.print("Informe a taxa de juros do empréstimo (use , (vírgula) para separador decimal. Ex: 1,8): ");
        var interestRate = sc.nextDouble();

        System.out.print("Informe o tempo em meses para pagamento: ");
        var month = sc.nextInt();

        var fixedInstallment = calculateFixedInstallment(value, interestRate, month);
        var amortization = calculateAmortization(value, interestRate, fixedInstallment);
        var interest = calculateInterest(value, interestRate);

        System.out.printf("\nValor fixo da parcela R$ %.2f, Saldo devedor total R$ %.2f\n\n", fixedInstallment, value);

        printTable(interestRate, month, value, fixedInstallment, amortization, interest);

        var totalInstallment = fixedInstallment.multiply(BigDecimal.valueOf(12));
        var totalInterest = totalInstallment.subtract(value);
        System.out.printf("\nTotal: Prestação R$ %.2f, Juros R$ %.2f, Amortização R$ %.2f\n", totalInstallment, totalInterest, value);

        sc.close();
    }

    private static void printTable(double interestRate,
                                   int month,
                                   BigDecimal debitBalance,
                                   BigDecimal fixedInstallment,
                                   BigDecimal amortization,
                                   BigDecimal interest
    ) {
        for (int i = 1; i <= month; i++) {
            debitBalance = debitBalance.subtract(amortization);

            System.out.printf("Parcela %d | Juros: R$ %.2f | Amortização: R$ %.2f | Saldo devedor: R$ %.2f\n",
                    i, interest, amortization, debitBalance);

            interest = calculateInterest(debitBalance, interestRate);
            amortization = calculateAmortization(debitBalance, interestRate, fixedInstallment);
        }
    }

    private static BigDecimal calculateInterest(BigDecimal amount, double interestRate) {
        var i = BigDecimal.valueOf(interestRate/100);

        return amount.multiply(i);
    }

    private static BigDecimal calculateAmortization(BigDecimal amount, double interestRate, BigDecimal fixedInstallment) {
        var interest = calculateInterest(amount, interestRate);

        return fixedInstallment.subtract(interest);
    }

    private static BigDecimal calculateFixedInstallment(BigDecimal currentValue, double interestRate, int month) {
        var i = BigDecimal.valueOf(interestRate/100);
        var resultOfPow = BigDecimal.ONE.add(i).pow(month);
        var numerator = resultOfPow.multiply(i);
        var denominator = resultOfPow.subtract(BigDecimal.ONE);
        var resultOfDivision = numerator.divide(denominator, MathContext.DECIMAL32);

        return currentValue.multiply(resultOfDivision);
    }
}

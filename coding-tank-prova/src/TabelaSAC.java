import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Scanner;

public class TabelaSAC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do empréstimo: ");
        var value = sc.nextBigDecimal();

        System.out.print("Informe a taxa de juros do empréstimo (use , (vírgula) para separador decimal. Ex: 1,8): ");
        var interestRate = sc.nextDouble();

        System.out.print("Informe o tempo em meses para pagamento: ");
        var month = sc.nextInt();


        var amortization = calculateAmortization(value, month);
        var interest = calculateInterest(value, interestRate);
        var installment = interest.add(amortization);

        System.out.printf("\nValor fixo da amortização R$ %.2f, Saldo devedor total R$ %.2f com um juros de %.2f%% ao mês\n\n", amortization, value, interestRate);
        printTable(interestRate, month, value, installment, amortization, interest);

    }

    private static void printTable(double interestRate,
                                   int month,
                                   BigDecimal debitBalance,
                                   BigDecimal installment,
                                   BigDecimal amortization,
                                   BigDecimal interest
    ) {
        for (int i = 1; i <= month; i++) {
            debitBalance = debitBalance.subtract(amortization);

            System.out.printf("Parcela %d | Juros: R$ %.2f | Prestação: R$ %.2f | Saldo devedor: R$ %.2f\n",
                    i, interest, installment, debitBalance);


            interest = calculateInterest(debitBalance, interestRate);
            installment = interest.add(amortization);
        }
    }

    private static BigDecimal calculateInterest(BigDecimal amount, double interestRate) {
        var i = BigDecimal.valueOf(interestRate/100);

        return amount.multiply(i);
    }

    private static BigDecimal calculateAmortization(BigDecimal amount, int month) {
        return amount.divide(BigDecimal.valueOf(month) , MathContext.DECIMAL32);
    }

}

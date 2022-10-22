import java.util.Locale;
import java.util.Scanner;

public class DiasDoMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o mês:");
        var mes = sc.nextLine().toLowerCase(Locale.ROOT);

        mes = converterPrimeiraLetraParaMaiuscula(mes);

        switch (mes) {
            case "Janeiro":
            case "Março":
            case "Maio":
            case "Julho":
            case "Agosto":
            case "Outubro":
            case "Dezembro":
                System.out.println(mes + " possui 31 dias.");
                break;

            case "Abril":
            case "Junho":
            case "Setembro":
            case "Novembro":
                System.out.println(mes + " possui 30 dias.");
                break;

            case "Fevereiro":
                System.out.println(mes + " possui 28 dias.");
                break;
            default:
                System.out.println("Entrada inválida");
        }
    }

    private static String converterPrimeiraLetraParaMaiuscula(String mes) {
        return mes.substring(0, 1).toUpperCase().concat(mes.substring(1));
    }
}

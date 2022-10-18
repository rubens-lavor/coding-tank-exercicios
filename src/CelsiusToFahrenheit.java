public class CelsiusToFahrenheit {
    public static void main(String[] args) {

        System.out.printf("Temperatura 1 %.2fºC são %.2fºF\n", 30.7, convert(30.7));
        System.out.printf("Temperatura 2 %.2fºC são %.2fºF\n", 23.0, convert(23));
    }

    private static double convert(double celsius) {
        final var factor1 = 1.8;
        final var factor2 = 32;

        return (celsius*factor1) + factor2;
    }
}

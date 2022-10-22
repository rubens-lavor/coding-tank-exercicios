import java.util.Locale;
import java.util.Scanner;

public class ConversaoTemperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quantas temperaturas serão transformadas?");
        var qntdTemperatura = sc.nextInt();
        sc.nextLine();

        if (qntdTemperatura <= 0) return;

        double[] temperaturas = new double[qntdTemperatura];
        double temperatura;

        for (int i = 1; i <= qntdTemperatura; i++) {
            System.out.printf("Informe a temperatura %d: ", i);
            temperatura = sc.nextDouble();
            sc.nextLine();
            temperaturas[i-1] = temperatura;
        }

        System.out.println("Qual a unidade de origem dessas temperaturas? [C, K, F]");
        var origem = sc.nextLine().toUpperCase(Locale.ROOT);

        if (!temperaturaValida(origem)) {
            System.out.println("Entrada especificada não é válida.");
            return;
        }

        System.out.println("Qual a unidade de destino dessas temperaturas? [C, K, F]");
        var destino = sc.nextLine().toUpperCase(Locale.ROOT);

        if (!temperaturaValida(destino)) {
            System.out.println("Entrada especificada não é válida.");
            return;
        }

        switch (origem) {
            case "C" :
                    switch (destino) {
                        case "K":
                            imprimirCelsiusParaKelvin(temperaturas);
                            break;
                        case "F":
                            imprimirCelsiusParaFahrenheit(temperaturas);
                            break;
                        default:
                            break;
                    }
                break;

            case "K" :
                    switch (destino) {
                        case "C":
                            imprimirKelvinParaCelsius(temperaturas);
                            break;
                        case "F":
                            imprimirKelvinParaFahrenheit(temperaturas);
                            break;
                        default:
                            break;
                    }
                break;

            case "F":
                    switch (destino) {
                        case "C":
                            imprimirFahrenheitParaCelsius(temperaturas);

                            break;
                        case "K":
                            imprimirFahrenheitParaKelvin(temperaturas);
                        default:
                            break;
                    }
                break;
        }

    }

    private static void imprimirCelsiusParaKelvin(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var kelvin =  converterCelsiusParaKelvin(temperatura);
            System.out.println(temperatura + " C = " + kelvin + " k");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediaKelvin = converterCelsiusParaKelvin(media);
        System.out.printf("A média das temperaturas é %.2f C = %.2f K", media, mediaKelvin);
    }

    private static void imprimirKelvinParaCelsius(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var celsius =  converterKelvinParaCelsius(temperatura);
            System.out.println(temperatura + " K = " + celsius + " C");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediaCelsius = converterKelvinParaCelsius(media);
        System.out.printf("A média das temperaturas é %.2f K = %.2f C", media, mediaCelsius);
    }

    private static double converterCelsiusParaKelvin(double tempCelsius) {
        return 273.15 + tempCelsius;
    }

    private static double converterKelvinParaCelsius(double tempKelvin) {
        return tempKelvin - 273.15;
    }

    private static void imprimirFahrenheitParaCelsius(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var celsius =  converterFahrenheitParaCelsius(temperatura);
            System.out.println(temperatura + " F = " + celsius + " C");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediaCelsius = converterFahrenheitParaCelsius(media);
        System.out.printf("A média das temperaturas é %.2f F = %.2f C", media, mediaCelsius);
    }

    private static double converterFahrenheitParaCelsius(double tempFahrenheit) {
        return (tempFahrenheit - 32) * 0.55;
    }

    private static void imprimirCelsiusParaFahrenheit(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var fahrenheit =  converterCelsiusParaFahrenheit(temperatura);
            System.out.println(temperatura + " C = " + fahrenheit + " F");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediafahrenheit = converterCelsiusParaFahrenheit(media);
        System.out.printf("A média das temperaturas é %.2f C = %.2f K", media, mediafahrenheit);
    }

    private static double converterCelsiusParaFahrenheit(double tempCelsius) {
        return (tempCelsius * 1.8) + 32;
    }

    private static double converterKelvinParaFahrenheit(double tempKelvin) {
        var celsius = converterKelvinParaCelsius(tempKelvin);
        return converterCelsiusParaFahrenheit(celsius);
    }

    private static void imprimirKelvinParaFahrenheit(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var fahrenheit =  converterKelvinParaFahrenheit(temperatura);
            System.out.println(temperatura + " K = " + fahrenheit + " F");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediaFahrenheit = converterKelvinParaFahrenheit(media);
        System.out.printf("A média das temperaturas é %.2f K = %.2f F", media, mediaFahrenheit);
    }

    private static double converterFahrenheitParaKelvin(double tempFahrenheit) {
        var celsius = converterFahrenheitParaCelsius(tempFahrenheit);
        return converterCelsiusParaKelvin(celsius);
    }

    private static void imprimirFahrenheitParaKelvin(double[] temperaturas) {
        var somatorio = 0.0;
        for (double temperatura : temperaturas) {
            var kelvin =  converterFahrenheitParaKelvin(temperatura);
            System.out.println(temperatura + " F = " + kelvin + " K");
            somatorio += temperatura;
        }

        var media = somatorio/temperaturas.length;
        var mediaKelvin = converterFahrenheitParaKelvin(media);
        System.out.printf("A média das temperaturas é %.2f F = %.2f K", media, mediaKelvin);
    }

    private static boolean temperaturaValida(String temperatura){
        return temperatura.matches("[CKF]");
    }
}

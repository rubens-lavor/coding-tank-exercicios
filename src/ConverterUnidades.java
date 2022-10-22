import java.util.Scanner;

public class ConverterUnidades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] velocidades = new int[]{35, 20, 10, 68, 75};

        System.out.print("Qual a unidade de origem? [m/s, km/h" +
                " ,mile/h, knot]: ");

        var origem = sc.nextLine();

        System.out.println("Qual a unidade de destino? [m/s, km/h" +
                ",mile/h, knot]");

        var destino = sc.nextLine();


        if (origem.equals("m/s")) {
            if (destino.equals("km/h")) {
                System.out.println("as velocidades convertidas são");
                for (int i = 0; i < 5; i++) {
                    System.out.println(velocidades[i] + " m/s = " + mpsToKmph(velocidades[i]) + " km/h");
                }
                return;
            }

            if (destino.equals("mile/h")) {
                System.out.println("as velocidades convertidas são");
                var kmph = 0.0;
                for (int i = 0; i < 5; i++) {
                    kmph = mpsToKmph(velocidades[i]);
                    System.out.println(velocidades[i] + " m/s = " + kmphToMileph(kmph) + " km/h");
                }
                return;
            }

            if (destino.equals("knot")) {
                System.out.println("as velocidades convertidas são");
                var kmph = 0.0;
                for (int i = 0; i < 5; i++) {
                    kmph = mpsToKmph(velocidades[i]);
                    System.out.println(velocidades[i] + " m/s = " + kmphToKnot(kmph) + " km/h");
                }
                return;
            }

            System.out.println("m/s para m/s");
        }

        if (origem.equals("km/h")) {
            if (destino.equals("m/s")) {
                System.out.println("as velocidades convertidas são");
                for (int i = 0; i < 5; i++) {
                    System.out.println(velocidades[i] + " km/h = " + kmphToMps(velocidades[i]) + " m/s");
                }
                return;
            }

            if (destino.equals("mile/h")) {
                System.out.println("as velocidades convertidas são");
                for (int i = 0; i < 5; i++) {
                    System.out.println(velocidades[i] + " km/h = " + kmphToMileph(velocidades[i]) + " mile/h");
                }
                return;
            }

            if (destino.equals("knot")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(velocidades[i] + " km/h = " + kmphToKnot(velocidades[i]) + " knot");
                }
                return;
            }

            System.out.println("km/h para km/h");

        }

        if (origem.equals("mile/h")) {
            if (destino.equals("m/s")) {
                System.out.println("as velocidades convertidas são");
                var kmph = 0.0;
                for (int i = 0; i < 5; i++) {
                    kmph = milephToKmph(velocidades[i]);
                    System.out.println(velocidades[i] + " mile/h = " + kmphToMps(kmph) + " m/s");
                }
                return;
            }

            if (destino.equals("knot")) {
                System.out.println("as velocidades convertidas são");
                var kmph = 0.0;
                for (int i = 0; i < 5; i++) {
                    kmph = milephToKmph(velocidades[i]);
                    System.out.println(velocidades[i] + " km/h = " + kmphToMileph(kmph) + " mile/h");
                }
                return;
            }

            if (destino.equals("knot")) {
                for (int i = 0; i < 5; i++) {
                    System.out.println(velocidades[i] + " km/h = " + kmphToKnot(velocidades[i]) + " knot");
                }
                return;
            }

            System.out.println("km/h para km/h");
        }

        if (origem.equals("knot")) {

        }

        sc.close();


    }

    private static double kmphToMps(double mps) {
        return mps/3.6;
    }

    private static double mpsToKmph(double kmps) {
        return kmps*3.6;
    }

    private static double milephToKmph(double mile) {
        return mile/1.609;
    }

    private static double kmphToMileph(double kmph) {
        return kmph*1.609;
    }

    private static double knotToKmph(double knot) {
        return knot/1.852;
    }

    private static double kmphToKnot(double kmph) {
        return kmph*1.852;
    }
}

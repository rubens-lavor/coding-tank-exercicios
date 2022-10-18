public class Args {
    public static void main(String[] args) {
        if (args.length == 1) {
            var num = Integer.parseInt(args[0]);

            if (num % 2 == 0) {
                System.out.println("O numero " + num + " é par");
                return;
            }

            System.out.println("O numero " + num + " é impar");
            return;
        }

        System.out.println("Número inválido de argumentos, é esperado que seja informado um argumento");

    }
}

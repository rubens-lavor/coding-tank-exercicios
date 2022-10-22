import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a quantidade de termos que deseja exibir da sequência de Fibonnaci?");
        var numTermos = sc.nextInt();
        sc.nextLine();

        if (numTermos > 45){
            System.out.println("Não é possível informar mais que 45 termos.");
            return;
        }

        for (int i = 1; i <= numTermos; i++) {
            System.out.print(calculaNesimoTermoDaSequenciaFibonacci(i) + " ");
        }

    }

    private static int calculaNesimoTermoDaSequenciaFibonacci(int valor) {
        if (valor == 2 || valor == 1) {
            return 1;
        } else {
            return calculaNesimoTermoDaSequenciaFibonacci(valor - 1)
                    + calculaNesimoTermoDaSequenciaFibonacci(valor - 2);
        }
    }
}

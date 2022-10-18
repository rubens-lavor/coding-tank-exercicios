import java.util.Scanner;

public class Sum {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe um valor inteiro: ");
        var value = sc.nextInt();
        sc.nextLine();

        var acc = 0;

        for (int i = value; i > 0; i--) {
            acc = acc + i;
        }

        System.out.println(acc);
    }
}

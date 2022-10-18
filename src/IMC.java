import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua altura em metros? ");
        var high = sc.nextDouble();
        sc.nextLine();

        System.out.print("Informe seu peso em Kg? ");
        var weight = sc.nextDouble();
        sc.nextLine();

        var imc = weight/(high*high);

        System.out.printf("O valor do seu IMC é %.2f", imc);


    }

}

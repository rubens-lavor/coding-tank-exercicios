import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.printf("Quantas palavras serão informadas?: ");
//        var n = sc.nextInt();
//        String[] words = new String[n];
//        sc.nextLine();
//
//        for (int i = 0; i < n; i++) {
//            System.out.println("Informe a palavra " + (i+1));
//            words[i] = sc.nextLine();
//        }
//
//        System.out.print("Palavras informadas: ");
//        for (String word : words) {
//            System.out.print(word + " ");
//        }
//
//        System.out.print("\nOrdem inversa: ");
//        for (int i = n-1; i >= 0 ; i--) {
//            System.out.print(words[i] + " ");
//        }


        // numero aleatório
        Random random = new Random();
        var num = random.nextInt(101);
        var smaller = 0;
        var bigger = 0;
        var count = 1;

        var value = 0;

        while (value != num) {
            System.out.println("Informe um número: ");
            value = sc.nextInt();
            sc.nextLine();

            if (value < num) {
                System.out.println(value + " é menor");
                if (smaller == 0){
                    smaller = value;
                }
                if (smaller > value) {
                    smaller = value;
                }
            }

            if (value > num) {
                System.out.println(value + " é maior");
                if (bigger == 0){
                    bigger = value;
                }
                if (bigger < value) {
                    bigger = value;
                }
            }

            count ++;

        }


        System.out.println(value + " está correto");
        System.out.println("Foram informados " + count + ", o menor " + smaller + " e o maior " + bigger);




//        System.out.printf("informe um numero: ");
//        var num = sc.nextInt();
//        sc.nextLine();
//
//        System.out.println(num + "! = " + fatorial(num));
//
        sc.close();

    }

    public static long fatorial(int x) {
        if (x == 0) return 1;

        return x * fatorial(x - 1);
    }
}
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        * Questão #1
Vale
10
Enunciado
Um funcionário deseja saber qual o valor líquido anual que recebe da sua empresa. Para tal cálculo é necessário
* considerar que o funcionário recebe o salário + décimo terceiro + férias e não esqueça de considerar o desconto
* do inss, não vamos trabalhar com imposto de renda nesse momento.
O inss tem desconto com base no valor mensal que o funcionário recebe e para isso vamos utilizar a regra a seguir:
de 0 até 1212.00 -> 7,5%.
de 1212.01 até 2427,35 -> 9%.
de 2427,36 até 3641,03 -> 12%.
de 3641,04 até 7087,22 -> 14%.
acima de 7087,22 deve ser descontado o teto de 900 reais.

O resultado final apresentado ao funcionário deve ter o salário anual bruto, total anual de inss descontado e o salário anual líquido final.
        * */
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
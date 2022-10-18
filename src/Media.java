import java.util.Arrays;
import java.util.Scanner;

public class Media {
    public static void main(String[] args) {

        double[] grades = new double[4];

        readGrades(grades);

        var media = getMedia(grades);
        System.out.printf("A média do aluno foi %.2f ", media);
    }

    private static void readGrades(double[] grades) {
        Scanner sc = new Scanner(System.in);
        double grade;
        var n = 1;

        while (n <= 4) {
            System.out.printf("Informe a nota prova %d: ", n);
            grade = sc.nextDouble();
            sc.nextLine();

            while (grade < 0.0 || grade > 10.0) {
                System.out.printf("Informe a nota prova %d: ", n);
                grade = sc.nextDouble();
                sc.nextLine();
            }

            grades[n -1] = grade;
            n++;
        }
    }

    private static double getMedia(double[] grades) {
        var total = Arrays.stream(grades).reduce(Double::sum).orElse(0.0);
        var numberOfElements = grades.length;

        return total/numberOfElements;
    }

}

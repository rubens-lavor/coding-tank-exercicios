import java.util.*;

public class Grades {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de provas: ");
        var n = sc.nextInt();
        sc.nextLine();

        int[] grades = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Informe a nota da prova " + (i + 1) + ":");
            grades[i] = sc.nextInt();
            sc.nextLine();
        }

        
        var list = getOrderedGrades(grades);

        var amount = Arrays.stream(grades).reduce(Integer::sum).orElse(0);
        var media = amount/n;

        System.out.println("A menor nota é: " + list.get(0));
        System.out.println("A maior nota é: " + list.get(n - 1));
        System.out.println("A média das notas é: " + media);

    }

    private static ArrayList<Integer> getOrderedGrades(int[] grades) {
        var list = new ArrayList<Integer>(List.of());
        for (int grade : grades) {
            list.add(grade);
        }

        Collections.sort(list);
        return list;
    }
}

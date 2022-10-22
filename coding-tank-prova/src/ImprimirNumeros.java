public class ImprimirNumeros {
    public static void main(String[] args) {
        var divisivelPor3 = false;
        var divisivelPor5 = false;
        var divisivelPor3e5 = false;

        for (int i = 1; i <= 100 ; i++) {
            divisivelPor3 = i % 3 == 0;
            divisivelPor5 = i % 5 == 0;
            divisivelPor3e5 = i % 3 == 0 && i % 5 == 0;

            if (divisivelPor3e5) {
                System.out.println("FizzBuzz");
            } else if (divisivelPor5){
                System.out.println("Buzz");
            } else if (divisivelPor3){
                System.out.println("Fizz");
            } else {
                System.out.println(i);
            }
        }
    }
}

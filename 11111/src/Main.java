import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int result = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10;
            number /= 10;

            if ((digit % 2) == (position % 2)) {
                result += Math.pow(2, position - 1);
            }
            position++;
        }

        System.out.println(result);
        scanner.close();
    }
}

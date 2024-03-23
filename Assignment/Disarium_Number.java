import java.util.Scanner;

public class Disarium_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (isDisarium(number)) {
            System.out.println(number + " is a Disarium number.");
        } else {
            System.out.println(number + " is not a Disarium number.");
        }
    }

    public static boolean isDisarium(int number) {
        int sum = 0;
        int len = String.valueOf(number).length();
        int n = number;

        while (n > 0) {
            int digit = n % 10;
            sum += Math.pow(digit, len);
            n /= 10;
            len--;
        }

        return sum == number;
    }
}
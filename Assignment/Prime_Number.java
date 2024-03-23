import java.util.Scanner;

public class Prime_Number {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();
        int n=number;
        // Check if the number is prime
        boolean isPrime = true;
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        // If the number is prime, check if its reverse is also prime
        if (isPrime) {
            int reverse = 0;
            while (number > 0) {
                reverse = reverse * 10 + number % 10;
                number /= 10;
            }

            boolean isReversePrime = true;
            for (int i = 2; i < reverse / 2; i++) {
                if (reverse % i == 0) {
                    isReversePrime = false;
                    break;
                }
            }

            // If the number and its reverse are both prime, then the number is twisted prime
            if (isReversePrime) {
                System.out.println(n + " is a twisted prime number.");
            } else {
                System.out.println(n + " is not a twisted prime number.");
            }
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}

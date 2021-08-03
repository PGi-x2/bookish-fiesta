package ro.siit.homework4;

import java.util.Scanner;

public class Fact2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number and you'll receive the factorial of your number: ");

        int num = scanner.nextInt();
        int factorial = fact(num);
        System.out.println("Factorial of entered number is: " + factorial);
    }

    public static int fact(int n) {
        int result;
        if (n == 0) {
            return 1;
        } else if (n > 0) ;
        return result = fact(n - 1) * n;
    }
}

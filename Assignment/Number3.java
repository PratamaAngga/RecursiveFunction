package Assignment;
import java.util.Scanner;
public class Number3 {
    public static boolean isPrime(int n, int divisor) {
        if (n <= 1) {
            return false;
        }
        if (divisor == n) {
            return true;
        }
        if (n % divisor == 0) {
            return false;
        }
        return isPrime(n, divisor + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        if (isPrime(n, 2)) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}

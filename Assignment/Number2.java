package Assignment;
import java.util.Scanner;
public class Number2 {
    public static int summationRecursive(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + summationRecursive(n - 1); // Recursive call
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        System.out.println("Sum of numbers from 1 to " + n + ": " + summationRecursive(n));
    }
}

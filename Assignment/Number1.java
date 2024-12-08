package Assignment;
import java.util.Scanner;
public class Number1 {
    public static void descendingRecursive(int n) {
        if (n >= 0) {
            System.out.println(n);
            descendingRecursive(n - 1);
        }
    }
    public static void descendingIterative(int n) {
        for (int i = n; i >= 0; i--) {
            System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = sc.nextInt();
        System.out.println("Descending Recursive: ");
        descendingRecursive(n);
        System.out.println("Descending Iterative: ");
        descendingIterative(n);
    }
}

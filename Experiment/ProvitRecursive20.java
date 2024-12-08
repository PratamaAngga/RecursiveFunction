package Experiment;
import java.util.Scanner;
public class ProvitRecursive20 {
    static double calculateProfit(double balance, int period) {
        if (period==0) {
            return balance;
        } else {
            return 1.11*calculateProfit(balance, period-1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Balance: ");
        double initialBalance = input.nextInt();
        System.out.println("Input Investment Period: ");
        int investPeriod = input.nextInt();
        System.out.println("Balance after "+investPeriod+" year = "+calculateProfit(initialBalance, investPeriod));
    }
}

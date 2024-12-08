package Experiment;

import java.util.Scanner;

public class PowerRecursive20 {
    static int calculatePower(int base, int pow) {
        if (pow == 0) {
            System.out.println("1");
            return 1;
        } else {
            System.out.print(base + (pow > 1 ? " x " : " x "));
            return base * calculatePower(base, pow - 1);
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input Base Number: ");
        int base = input.nextInt();
        System.out.print("Input Power Number: ");
        int power = input.nextInt();
        System.out.println("Result of "+base+" power "+power+" = "+calculatePower(base, power));
    }
}

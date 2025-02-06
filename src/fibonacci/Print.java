package fibonacci;

import java.util.Scanner;


import static fibonacci.Fibonacci.generateFibonacci;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introdu numarul de termeni Fibonacci:: ");
        int num = scanner.nextInt();
        generateFibonacci(num);
        scanner.close();
    }
}

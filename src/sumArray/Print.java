package sumArray;

import java.util.Scanner;
import static sumArray.SumArray.calculateSum;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti numarul de elemente:: ");
        int num = scanner.nextInt();

        int[] numbers = new int[num];

        System.out.println("  Introduceti " + num + " numere:: ");
        for(int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("  Suma numerelor este:: " + calculateSum(numbers));
        scanner.close();
    }
}

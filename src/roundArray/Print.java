package roundArray;

import java.util.Arrays;
import java.util.Scanner;

import static roundArray.RoundArray.roundArray;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti numarul de elemente::");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        System.out.println("  Introduceti:: " + num + " numere.");
        for(int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("  Introduceti numarul de pozitii rotate:: ");
        int k = scanner.nextInt();

        roundArray(numbers,k);

        System.out.println("  Arayul rotit:: " + Arrays.toString(numbers));

        scanner.close();
    }
}

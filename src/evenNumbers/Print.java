package evenNumbers;

import java.util.Scanner;

import static evenNumbers.EvenNumbers.searchEven;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti numarul de elemente:: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        System.out.println("  Introduceti:: " + num + " numere:: ");
        for (int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }
        int[] even = searchEven(numbers);
        System.out.println("  Numerele pare sunt:: ");
        for (int number:
             even) {
            System.out.println("  " + number + " ");
        }
        scanner.close();
    }
}

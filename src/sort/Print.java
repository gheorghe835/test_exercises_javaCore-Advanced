package sort;

import java.util.Scanner;

import static sort.BubbleSort.bubbleSort;
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
        bubbleSort(numbers);
        System.out.println("  Arrayul sortat:: ");
        for (int number:
             numbers) {
            System.out.println(number + "  ");
        }
        scanner.close();
    }
}

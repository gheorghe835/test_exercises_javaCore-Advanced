package arrayCombination;

import java.util.Arrays;
import java.util.Scanner;

import static arrayCombination.ArrayCombination.arrayCombination;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti dimensiunea primului array:: ");
        int num1 = scanner.nextInt();
        int[] array1 = new int[num1];
        System.out.println("  Introduceti elementele primului element::");
        for(int i = 0; i < num1; i++){
            array1[i] = scanner.nextInt();
        }

        System.out.println("  Introduceti dimensiunea al doilea array:: ");
        int num2 = scanner.nextInt();
        int[] array2 = new int[num2];
        System.out.println("  Introduceti elementele al doilea element::");
        for(int i = 0; i < num2; i++){
            array2[i] = scanner.nextInt();
        }

        int[] arrayCombining = arrayCombination(array1,array2);
        System.out.println("  Arrayul combinat:: " + Arrays.toString(arrayCombining));
        scanner.nextLine();
    }
}

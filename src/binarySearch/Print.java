package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

import static binarySearch.BinarySearch.binarySearch;
public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti numarul de elemente:: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        System.out.println("  Introduceti " + num + " numere:: ");
        for(int i = 0; i < num; i ++){
            numbers[i] = scanner.nextInt();
        }

        Arrays.sort(numbers);//Arayul trebuie sortat
        System.out.println("  Arrayul sortat:: " + Arrays.toString(numbers));
        System.out.println("  Introduceti numarul pe care doriti sa-l cautati:: ");
        int value = scanner.nextInt();
        int result = binarySearch(numbers,value);
        if(result != -1){
            System.out.println("  Numarul:: " + value + " a fost gasit la indexul:: " + result);
        }
        else {
            System.out.println("  Numarul:: " + value + " nu a fost gasit.");
        }
        scanner.close();
    }
}

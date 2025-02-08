package searchElement;

import java.util.Scanner;

import static searchElement.SearchElement.searchElement;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti numarul de elemente:: ");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        System.out.println("  Introduceti:: " + num + " numere.");

        for(int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("  Introduceti elementul cautat:: ");
        int element = scanner.nextInt();

        int index = searchElement(numbers,element);
        if(index != -1){
            System.out.println("  Elementul:: " + element + " , se afla in indexul:: " + index);
        }
        else
            System.out.println("  Elementul:: " + element + " , nu a fost gasit.");

        scanner.nextLine();
    }
}

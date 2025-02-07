package countLetter;

import java.util.Scanner;

import static countLetter.CountLetter.countLetter;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti un text::");
        String text = scanner.nextLine();
        System.out.println("  Introdu caracterul cautat:: ");
        char caracter = scanner.next().charAt(0);
        int count = countLetter(text,caracter);
        System.out.println("  Caracterul:: " + caracter + ", apare de:: " + count + " ori.");
        scanner.close();
    }
}

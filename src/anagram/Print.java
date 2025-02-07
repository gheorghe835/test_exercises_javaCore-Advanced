package anagram;

import java.util.Scanner;

import static anagram.Anagram.isAnagram;
public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti primul string:: ");
        String s1 = scanner.nextLine();

        System.out.println("  Introduceti al doilea string:: ");
        String s2 = scanner.nextLine();

        if(isAnagram(s1,s2)) System.out.println("  Stringurile:: " + s1 + ", " + s2 + " , sunt anagrame.");
        else System.out.println("  Stringurile:: " + s1 + ", " + s2 + " , nu sunt anagrame.");

        scanner.close();
    }
}

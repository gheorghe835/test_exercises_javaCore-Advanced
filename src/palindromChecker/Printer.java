package palindromChecker;

import static palindromChecker.PalindromChecker.isPalindrome;

public class Printer {
    public static void main(String[] args) {
        String word1 = "madam";
        String word2 = "hello";
        System.out.println("  " + word1 + " - este palindrom ? --- " + isPalindrome(word1));
        System.out.println("  " + word2 + " - este palindrom ? --- " + isPalindrome(word2));
    }
}

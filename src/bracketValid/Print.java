package bracketValid;

import java.util.Scanner;

import static bracketValid.BracketValid.bracketValid;


public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti un text pentru validarea parantezelor:: ");
        String text = scanner.nextLine();

        boolean result = bracketValid(text);
        if(result){
            System.out.println("  Parantezele sunt corect inchise.");
        }
        else
            System.out.println("  Parantezele NU sunt corect inchise.");

        scanner.close();
    }
}

package concat;

import java.util.Scanner;

import static concat.Concat.concat;
import static concat.Concat.concatStringBuilder;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introduceti primul String:: ");
        String string1 = scanner.nextLine();
        System.out.println("  Introduceti al doilea String:: ");
        String string2 = scanner.nextLine();

        //prima metoda
        String result1 = concat(string1,string2);
        System.out.println("  Stringul concatinat:: " + result1);

        //a doua metoda
        String result2 = concatStringBuilder("Hello ", " world!");
        System.out.println("  Stringul concatinat:: " + result2);

    }
}

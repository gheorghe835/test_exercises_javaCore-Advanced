package stringReverser;

import static stringReverser.StringReverser.stringReverser;

public class Print {
    public static void main(String[] args) {
        String original = "Java";
        String reverse = stringReverser(original);
        System.out.println("  String original :: " + original);
        System.out.println("  String inversat :: " + reverse);
    }
}

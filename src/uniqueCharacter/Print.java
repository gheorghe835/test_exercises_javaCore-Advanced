package uniqueCharacter;

import static uniqueCharacter.UniqueCharacter.isUniqueCharacter;

public class Print {
    public static void main(String[] args) {
        String text = "abcdefa";
        boolean result = isUniqueCharacter(text);
        System.out.println("  Toate caracterele sunt unice:: " + result);
    }
}

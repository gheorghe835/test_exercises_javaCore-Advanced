package findSubString;

import java.util.List;

import static findSubString.FindSubstring.findAllSubstring;
public class Print {
    public static void main(String[] args) {
        String text = "abcd";
        List<String> subStrings = findAllSubstring(text);
        System.out.println("  Substringurile sunt:: " + subStrings);
    }
}

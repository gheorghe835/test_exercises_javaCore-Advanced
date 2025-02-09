package findSubString;

//Substring: 21. Scrie o funcție care găsește toate substrigurile dintr-un string dat.

import java.util.ArrayList;
import java.util.List;

//Metoda doua bucle imbricate
public class FindSubstring {
    public static List<String> findAllSubstring(String text){
        List<String> subStrings = new ArrayList<>();
        //doua bucle imbricate pentru agenera toate substringurile
        for(int i = 0; i < text.length(); i++){
            for (int j = i + 1; j <= text.length(); j++){
                subStrings.add(text.substring(i,j));//adaugam substringul in lista
            }
        }
        return subStrings;
    }
}

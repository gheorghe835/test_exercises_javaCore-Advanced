package uniqueCharacter;

//24.	Unicitatea caracterelor: Scrie o funcție care verifică dacă toate caracterele dintr-un string sunt unice.

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacter {
    public static boolean isUniqueCharacter(String text){
        Set<Character> set = new HashSet<>();
        for (char c:
             text.toCharArray()) {
            if(set.contains(c)){
                return false; //daca caracterul este deja in set, nu este unic
            }
            set.add(c);
        }
        return true;//dacaarcurgem toate caracterele fera duplicatele, sunt unice
    }
}

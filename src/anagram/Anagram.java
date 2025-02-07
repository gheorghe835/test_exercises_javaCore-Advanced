package anagram;

//14.	Anagramă: Scrie o funcție care verifică dacă două stringuri sunt anagrame.

import java.util.Arrays;

public class Anagram {
    public static boolean isAnagram(String s1, String s2){
        //eliminam spatiile si convertim la litere mici
        s1 = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s","").toLowerCase();

        //daca lungimiile sunt diferite nu sunt anagrame
        if(s1.length() != s2.length()) return false;

        //convertim stringurile in arrayuri de caractere si le sortam
        char[] array1 = s1.toCharArray();
        char[] array2 = s2.toCharArray();

        Arrays.sort(array1);
        Arrays.sort(array2);

        //comparam arrayurile sortate

        return Arrays.equals(array1,array2);

    }
}

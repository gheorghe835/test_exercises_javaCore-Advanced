package roundArray;

//15.	Rotirea unui string array: Scrie o funcție care rotește spre stinga un array cu K poziții.

public class RoundStringArray {
    public static String roundLeftString(String text, int k){
        int num = text.length();
        k = k % num; // daca k este mai mare decit lingimea stringului, rotim doar k%N pozitii
        //concatinam partea de dupa primele K caractere cu partea initiala
        return text.substring(k) + text.substring(0,k);
    }

}

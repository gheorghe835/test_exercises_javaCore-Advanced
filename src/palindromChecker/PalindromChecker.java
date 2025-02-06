package palindromChecker;


//2.Verificarea palindromului: Scrie o funcție care verifică dacă un string este palindrom.
public class PalindromChecker {
    public static boolean isPalindrome(String text){
        //Convertim textul la litere mici si eliminam spatiile pentru a evita probleme
        text = text.toLowerCase().replaceAll("\\s+","");
        //Definim doi indici, unul la inceput altul la sfirsit
        int left = 0;
        int right = text.length() - 1;
        //Verificarea caracter cu caracter pina la mijloc
        while (left < right){
            if (text.charAt(left) != text.charAt(right)) return false;
            left  ++;
            right --;
        }
        return true;
    }
}

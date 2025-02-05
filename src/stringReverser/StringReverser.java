package stringReverser;

public class StringReverser {
    //Functie ce inverseaza un string
    public static String stringReverser(String text){
        //Convertim stringul intr-un array de caractere
        char[] characters = text.toCharArray();
        int left = 0;//inceputul stringului
        int right = characters.length - 1;//sfirsitul stringului
        //Parcurgem stringul pina la mijloc
        while (left < right) {
            //Schimbam caracterele intre ele
            char temp = characters[left];
            characters[left] = characters[right];
            characters[right] = temp;
            //Mutam indicii spre interior
            left++;
            right--;
        }
        //Convertim arayul inversat inapoi in string
        return new String(characters) ;
    }
}

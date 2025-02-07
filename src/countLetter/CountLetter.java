package countLetter;

//13.	Numărul de apariții: Scrie o funcție care numără aparițiile unui caracter într-un string.

public class CountLetter {
    public static int countLetter(String text, char caracter){
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            if(text.charAt(i) == caracter){
                count ++;
            }
        }
        return count;
    }
}

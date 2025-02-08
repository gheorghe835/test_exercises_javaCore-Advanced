package countWord;

//20.	Numărul de cuvinte: Scrie o funcție care numără cuvintele dintr-un string.

//metoda split()

public class CountWord {
    public static int countWord(String text){
        if(text == null | text.isEmpty()){
            return 0;//daca stringul este gol sau null, returnam 0
        }
        String[] words = text.trim().split("\\s+");//impartim stringul pe baza spatiilor multiple

        return words.length;
    }
}

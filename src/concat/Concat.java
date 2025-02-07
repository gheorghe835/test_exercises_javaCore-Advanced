package concat;

public class Concat {

    //prima metoda
    public static String concat(String string1, String string2){
        return string1 + string2; //concatinare simpla
    }

    //a doua metoda
    public static String concatStringBuilder(String string3, String string4){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(string3);
        stringBuilder.append(string4);
        return stringBuilder.toString();
    }


}

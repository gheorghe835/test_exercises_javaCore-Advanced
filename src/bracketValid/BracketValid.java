package bracketValid;

//19.	Validarea parantezelor: Scrie o funcție care verifică dacă parantezele dintr-un string sunt corect închise.

import java.util.Stack;

//Metoda Stack
public class BracketValid {
    public static boolean bracketValid(String text){
        Stack<Character> stack = new Stack<>();
        for (char c:
             text.toCharArray()) {
            //daca este o paranteza de deschidere o adaugam in stiva
            if(c == '(' | c == '[' | c == '{') {
                stack.push(c);
            }
            //daca este o paranteza de inchidere
            else if(c == ')' | c == ']' | c =='}'){
                if(stack.isEmpty()){
                    return false;//daca nu avem o paranteza de deschidere corespunzatoare
                }
                char open = stack.pop();
                if(!isPair(open,c)){
                    return false;//daca parantezele nu se potrivesc
                }
            }
        }
        //daca stiva este goala toate parantezele sunt inchise corect
        return stack.isEmpty();
    }

    private static boolean isPair(char open, char close){
        return (open == '(' & close == ')') | (open == '[' & close == ']') | (open == '{' & close == '}');
    }
}

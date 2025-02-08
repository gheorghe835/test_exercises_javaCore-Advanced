package countWord;

import java.util.Scanner;

//import static countWord.CountWord.countWord;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti un text (introduceti 'STOP' pentru a termina):");

        StringBuilder text = new StringBuilder();
        while (true) {
            String line = scanner.nextLine();
            if (line.equalsIgnoreCase("STOP")) {  // Dacă linia este "STOP", ieșim din buclă
                break;
            }
            text.append(line).append(" ");  // Adăugăm linia în textul complet
        }

        int countWord = CountWord.countWord(text.toString());
        System.out.println("Numarul de cuvinte: " + countWord);

        scanner.close();
    }
}

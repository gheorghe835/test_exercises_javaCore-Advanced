package roundArray;

import java.util.Arrays;
import java.util.Scanner;

import static roundArray.RoundArray.roundArray;
import static roundArray.RoundStringArray.roundLeftString;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //metoda pentru numere
        System.out.println("  Introduceti numarul de elemente::");
        int num = scanner.nextInt();
        int[] numbers = new int[num];
        System.out.println("  Introduceti:: " + num + " numere.");
        for(int i = 0; i < num; i++){
            numbers[i] = scanner.nextInt();
        }
        System.out.println("  Introduceti numarul de pozitii rotate:: ");
        int k = scanner.nextInt();

        roundArray(numbers,k);

        System.out.println("  Arayul rotit:: " + Arrays.toString(numbers));

        scanner.nextLine();

        //metoda pentru string
        // Citire text de la utilizator
        System.out.print("  Introduceti un text: ");
        String text = scanner.nextLine();

        int K = 0;
        boolean inputValid = false;

        // Verificare dacă input-ul este un număr valid
        System.out.print("  Introduceti numarul de pozitii rotate: "); // Afișăm mesajul o singură dată
        while (!inputValid) {
            String input = scanner.nextLine();
            try {
                K = Integer.parseInt(input);
                inputValid = true; // Dacă conversia este reușită, ieșim din buclă
            } catch (NumberFormatException e) {
                System.out.print("  Eroare: Introduceti un număr valid! Incercati din nou: ");
            }
        }

        // Apelăm funcția de rotație
        String rezultat = roundLeftString(text, K);
        System.out.println("  Stringul rotit: " + rezultat);


        scanner.close();
    }
}

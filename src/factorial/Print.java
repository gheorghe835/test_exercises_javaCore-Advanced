package factorial;

import java.util.Scanner;
import static factorial.Factorial.calculateFctorial;

public class Print {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("  Introdu un numar pentru factorial:: ");
        int number = scanner.nextInt();

        try{
            System.out.println("  " + number + " != " + calculateFctorial(number));
        }
        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}

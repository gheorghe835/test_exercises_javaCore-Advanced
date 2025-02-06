package primNumber;

import static primNumber.PrimNumber.isPrim;

public class Print {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,10,17,19,20,23};
        for (int number:
             numbers) {
            System.out.println("  " + number + " -- este numar prim ? -- " + isPrim(number) );
        }
    }
}

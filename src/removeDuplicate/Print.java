package removeDuplicate;

import java.util.Arrays;

import static removeDuplicate.RemoveDuplicate.removeDuplicate;

public class Print {
    public static void main(String[] args) {
        int[] array = {1,2,2,3,3,3,4,5,6};

        int[] result = removeDuplicate(array);

        System.out.println("  Arrayul original:: " + Arrays.toString(array));
        System.out.println("  Arrayul fara duplicate:: " + Arrays.toString(result));
    }
}

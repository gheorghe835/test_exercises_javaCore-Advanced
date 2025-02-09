package findSumOfLargestK;

//25.	Găsește suma celor mai mari K numere: Scrie o funcție care găsește suma celor mai mari K numere dintr-un array.

import java.util.Arrays;

public class FindSumOfLargestK {
    public static int findSumOfLargestK(int[] array, int k){
        if(array == null | array.length < k | k <= 0){
            throw new IllegalArgumentException("  Arrayl este prea mai mic sau K nu este valid");
        }
        //sortam arrayul in ordine descrescatoare
        Arrays.sort(array);
        int sum = 0;
        for(int i = array.length - 1; i >= array.length - k; i--){
            sum += array[i];
        }
        return sum;
    }
}

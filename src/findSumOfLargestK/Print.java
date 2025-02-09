package findSumOfLargestK;


import static findSumOfLargestK.FindSumOfLargestK.findSumOfLargestK;

public class Print {
    public static void main(String[] args) {
        int[] array = {1,5,2,9,12,7};
        int k = 1;
        int sum = findSumOfLargestK(array,k);
        System.out.println("  Suma celor mai mari:: " + k + " numere este:: " + sum);
    }
}

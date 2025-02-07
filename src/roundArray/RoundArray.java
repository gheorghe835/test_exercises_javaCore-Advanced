package roundArray;

//15.	Rotirea unui array: Scrie o funcție care rotește un array cu K poziții.

public class RoundArray {
    public static void roundArray(int[] numbers, int k){
        int num = numbers.length;
        k = k % num; // daca k este mai mare decit n, rotim doar k % n pozitii

        reverse(numbers,0,num-1);//inversam tot arrayul
        reverse(numbers,0,k-1);//inversam primele k elemente
        reverse(numbers,k,num-1);//inversam ultimele N-k elemente

    }

    private static void reverse(int[] numbers, int start, int end){
        while (start < end){
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;

        }
    }
}

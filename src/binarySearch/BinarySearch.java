package binarySearch;

//9.	Căutarea binară: Implementează algoritmul de căutare binară.
public class BinarySearch {
    public static int binarySearch(int[] numbers, int value){
        int left = 0, right = numbers.length - 1;
        while (left <= right){
            int midlle = left + (right - left)/2;//evitam depasirea int
            if(numbers[midlle] == value){
                return midlle;//elementul gasit
            }
            if(numbers[midlle] < value){
                left = midlle + 1;//cautam in jumatatea dreapta
            }
            else {
                right = midlle - 1;//cautam in jumatatea stinga
            }
        }
        return -1;//elementul nu exista
    }
}

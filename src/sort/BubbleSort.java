package sort;

//8.	Sortarea unui array: Implementează algoritmul de sortare (ex: Bubble Sort, Quick Sort)

public class BubbleSort {
    public static void bubbleSort(int[] numbers){
        int num = numbers.length;

        boolean change;

        do {
            change = false;
            for (int i = 0; i < num - 1; i++){
                if(numbers[i] > numbers[i + 1]){
                    //interschimbam elementele
                    int temp = numbers[i];
                    numbers[i] = numbers[i + 1];
                    numbers[i + 1] = temp;
                    change = true;
                }
            }
        }
        while (change);//repetam pina nu sunt schimbari
    }
}

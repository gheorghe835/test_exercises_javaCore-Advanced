package minMax;

//7.	Maximul și minimul: Scrie o funcție care găsește valoarea maximă și minimă dintr-un array
public class MinMax {
    public static void minMax(int[] numbers){
        if(numbers.length == 0){
            System.out.println("  Arrayul este gol.");
            return;
        }
        int min = numbers[0];
        int max = numbers[0];

        for (int number:
             numbers) {
            if(number < 0){
                min = number;
            }
            if(number > max){
                max = number;
            }
        }

        System.out.println("  Valoarea minima:: " + min);
        System.out.println("  Valoarea maxima:: " + max);
    }
}

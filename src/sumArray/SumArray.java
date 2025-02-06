package sumArray;

//6.	Suma numerelor: Scrie o funcție care returnează suma numerelor dintr-un array.

public class SumArray {
    public static int calculateSum(int[] numbers){
        int sum = 0;//initializam suma cu 0
        //parcurgem fiecare element
        for (int number:
             numbers) {
            sum += number;//adunam valorile la suma
        }
        return sum;
    }
}

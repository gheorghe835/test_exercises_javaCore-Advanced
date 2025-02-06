package evenNumbers;

//10.	Numerele pare: Scrie o funcție care returnează toate numerele pare dintr-un array.
public class EvenNumbers {
    public static int[] searchEven(int[] numbers){
        int count = 0;
        //numaram cite numere pare sunt
        for (int number:
             numbers) {
            if(number %2 == 0){
                count ++;
            }
        }
        //cream un nou array pentru numere pare
        int[] even = new int[count];
        int index = 0;
        //adaugam numerele pare in arayul rezultat
        for (int number:
             numbers) {
            if(number %2 == 0){
                even[index++] = number;
            }
        }
        return even;
    }
}

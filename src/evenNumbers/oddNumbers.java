package evenNumbers;

//11.	Numerele impare: Scrie o funcție care returnează toate numerele impare dintr-un array.

public class oddNumbers {
    public static int[] searchOdd(int[] numbers){
        int count = 0;
        //numaram cite numere impare sunt
        for (int number:
                numbers) {
            if(number %2 != 0){
                count ++;
            }
        }
        //cream un nou array pentru numere pare
        int[] odd = new int[count];
        int index = 0;
        //adaugam numerele impare in arayul rezultat
        for (int number:
                numbers) {
            if(number %2 == 0){
                odd[index++] = number;
            }
        }
        return odd;
    }
}

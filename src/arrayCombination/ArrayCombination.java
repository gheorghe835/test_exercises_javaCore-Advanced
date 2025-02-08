package arrayCombination;

//17.	Combinarea array-urilor: Scrie o funcție care combină două array-uri într-unul singur.

//Metoda folosind bucle

public class ArrayCombination {
    public static int[] arrayCombination(int[] array1, int[] array2){
        int length1 = array1.length;
        int length2 = array2.length;

        int [] result = new int[length1 + length2];//array nou cu dimensiune combinata
        //copiem elementele din primul array
        for(int i = 0; i < length1; i++){
            result[i] = array1[i];
        }

        //copiem elementele din al doilea array
        for(int i = 0; i < length2; i++){
            result[length1 + i] = array2[i];;
        }
        return result;
    }
}

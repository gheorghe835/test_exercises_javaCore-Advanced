package removeDuplicate;

//18.	Ștergerea duplicatelor: Scrie o funcție care elimină duplicatele dintr-un array.

import java.util.LinkedHashSet;
import java.util.Set;

//Metoda folosind set
public class RemoveDuplicate {
    public static int[] removeDuplicate(int[] array){
        Set<Integer> set = new LinkedHashSet<>();//pastrarea ordinii elementelor
        for (int num:
             array) {
            set.add(num);// adunam fiecare element in set(duplicatele se elimina automat)
        }
        //convertim setul in array
        int[] result = new int[set.size()];
        int index = 0;
        for (int num:
             set) {
            result[index++] = num;
        }
        return result;
    }
}

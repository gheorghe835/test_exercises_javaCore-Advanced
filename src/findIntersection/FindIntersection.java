package findIntersection;

//23.	Intersecția a două array-uri: Scrie o funcție care găsește intersecția a două array-uri.

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindIntersection {
    public static List<Integer> findIntersection(int[] array1, int[] array2){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> intersection = new HashSet<>();
        //adunam toate elementele din primul array in set1
        for (int num:
             array1) {
            set1.add(num);
        }
        //verificam daca elementele din al doilea array sunt in set1
        for (int num:
             array2) {
            if(set1.contains(num)){
                intersection.add(num);//adunam elementele comune in setul de intersectie
            }
        }
        return new ArrayList<>(intersection);
    }
}

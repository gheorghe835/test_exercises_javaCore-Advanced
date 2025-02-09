package findIntersection;

import java.util.List;

import static findIntersection.FindIntersection.findIntersection;

public class Print {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {4,5,6,7,8};
        List<Integer> result = findIntersection(array1,array2);
        System.out.println("  Intersectia celor doua arrayuri:: " + result);
    }
}

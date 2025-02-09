package createHashMap;

import java.util.Map;

import static createHashMap.CreateHashMap.createHashMap;
public class Print {
    public static void main(String[] args) {
        String[] array = {"apple","banana","apple","orange","banana","apple"};
        Map<String,Integer> result = createHashMap(array);
        System.out.println("  HashMapul creat:: " + result);
    }
}

package createHashMap;

//22.	Creează un hashmap: Scrie o funcție care creează un hashmap dintr-un array de stringuri.

import java.util.HashMap;
import java.util.Map;

public class CreateHashMap {
    public static Map<String,Integer> createHashMap(String[] array){
        Map<String,Integer> hashMap = new HashMap<>();
        for (String element:
             array) {
            //daca elementul exista deja in HashMap, incrementam valoarea
            if(hashMap.containsKey(element)){
                hashMap.put(element,hashMap.get(element) + 1);
            }
            else {
                //daca elementul nu exista , il adaugam cu valoarea 1
                hashMap.put(element, 1);
            }
        }
        return hashMap;
    }
}

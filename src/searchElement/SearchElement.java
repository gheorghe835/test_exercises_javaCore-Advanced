package searchElement;

//16.	Căutarea unui element: Scrie o funcție care caută un element într-un array și returnează indexul acestuia.

//Metoda liniara

public class SearchElement {
    public static int searchElement(int[] numbers, int element){

        for(int i = 0; i< numbers.length; i++){
            if(numbers[i] == element){
                return i;//returnam indexul daca elementul este gasit
            }
        }
        return -1;// returnam indexul daca elementul nu este gasit
    }
}

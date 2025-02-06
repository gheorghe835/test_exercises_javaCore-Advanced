package primNumber;

//3.	Numere prime: Scrie o funcție care verifică dacă un număr este prim.

public class PrimNumber {
    public static boolean isPrim(int number){
        if(number < 2) return false;

        //2 si 3 sunt prime
        if (number == 2 | number == 3) return true;

        //Eliminam multiplii 2 si de 3
        if(number %2 == 0 | number %3 == 0) return false;

        // Verificarea doar divizorii pina la ^numar
        for (int i = 5; i * i <= number; i += 6){
            if(number %i == 0 | number %(i + 2) == 0)return false;
        }
        return true;
    }
}

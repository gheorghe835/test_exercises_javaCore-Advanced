package fibonacci;

//4.	Fibonacci: Scrie o funcție care generează primele N numere Fibonacci.

public class Fibonacci {
    public static void generateFibonacci(int number){
        if(number <= 0){
            System.out.println("  Introdu un numar mai mare de 0 !!! ");
            return;
        }
        long first = 0, second = 1;//primele doua numere fibonacci

        System.out.println("  The first -- " + number + " numbers Fibonacci:");
        for (int i = 0; i < number; i ++ ){
            System.out.println("  " + first + " ");//numarul curent
            long next = first + second;//calculam urmatorul numar
            first = second;//mutam valorile pentru urmatoare iteratie
            second = next;
        }
    }
}

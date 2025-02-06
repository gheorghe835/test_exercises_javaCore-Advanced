package factorial;

//5.	Factorial: Scrie o funcție care calculează factorialul unui număr.

public class Factorial {
    public static long calculateFctorial(int number){
        if(number < 0){
            throw new IllegalArgumentException("  Factorialul nu este definit pentru numere negative");
        }
        long factorial = 1; //initializam factorialul cu 1
        for(int i = 1; i <= number; i++){
            factorial *= i;
        }
        return factorial;
    }
}

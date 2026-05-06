import java.util.Scanner;

public class Factorial {
    public  int factorial(int n){
        if (n == 1) {
            return 1;
        } // base case
        return  n * factorial(n - 1)  ;
    }
}




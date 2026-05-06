import java.util.Scanner;

public class Factorial {
    static Scanner scanner = new Scanner(System.in);

    public static int factorial(int n){
        if (n == 1) {
            return 1;
        } // base case
        return  n * factorial(n - 1)  ;
    }
}




    }
}

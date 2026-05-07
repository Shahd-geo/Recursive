public class BunnyEars10 {
    public static int bunnyEars(int n){
        if (n==0){
            return 0;
        }
        return 2 + bunnyEars(n - 1);

    }
}

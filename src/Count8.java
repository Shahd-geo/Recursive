public class Count8 {
    public static int count8(int n){
        if (n == 0){
            return 0;
        }
        int lastDigit=n%10;
        int seconedLastDigit= (n / 10) % 10;
        int remove =n/10;
        int count = 0 ;
        if (lastDigit==8 ){
            if (seconedLastDigit==8){
                return 2 + count8(remove);
            } else {
                return 1 + count8(remove);


            }
        }return 0 + count8(remove);
    }
}

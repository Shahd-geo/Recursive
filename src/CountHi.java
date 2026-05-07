public class CountHi {
    public static int countHi(String str){
        if (str.length()>2){
            return 0;
            int count = 0;
            String fristTwoChar= str.substring(0,2);
            if (fristTwoChar=="hi"){
                return 1 + countHi(str.substring(2));
            }

        }

    }
}

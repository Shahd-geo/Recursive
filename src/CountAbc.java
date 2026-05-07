public class CountAbc {
    public static int  countAbc(String str){
        if (str.length()<3){
            return 0;
        }
        String Frist3 = str.substring(0,3);
        if (Frist3.equals("abc")||(Frist3.equals("aba"))){
            return 1 + countAbc(str.substring(1));
        }else {
            return countAbc(str.substring(1));

        }

    }
}

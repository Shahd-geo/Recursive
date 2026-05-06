public class PairStar {
    public static String pairStar(String str){
        if (str.length()==0 || str.length()==1){
            return str;

        }
        char Frist= str.charAt(0);
        char NEXT = str.charAt(1);
        if (Frist == NEXT) {
            return Frist + "*" + pairStar(str.substring(1));
        }else {
            return firstChar + pairStar(st
        }

    }
}

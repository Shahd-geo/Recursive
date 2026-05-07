public class NoX {
    public  String NoX(String str) {
        if (str.length() == 0) {
            return "";
        }
        char frist = str.charAt(0);
        String remaining = NoX(str.substring(1));
        if (frist == 'x') {
            return remaining;

        } else {
            return frist + remaining;

        }


    }
}

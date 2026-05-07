public class namedNoX {
    public  String noX(String str) {
        if (str.length() == 0) {
            return "";
        }
        char frist = str.charAt(0);
        String remaining = noX(str.substring(1));
        if (frist == 'x') {
            return remaining;

        } else {
            return frist + remaining;

        }


    }
}

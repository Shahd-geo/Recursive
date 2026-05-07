public class namedNoX {
    public static String noX(String str){
        if (str.length()==0){
            return "";
        }
        char frist = str.charAt(0);
        String remaining = noX(str.substring(1));

    }
}

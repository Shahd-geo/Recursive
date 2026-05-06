public class ChangePi {
    public static String changePi(String str){
        if (str.isEmpty()){
            return "";

        }
        if (str.startsWith("pi")){
            return "3.14" + changePi(str.substring(2));
        }else {
            String FRIST = str.charAt(0);

        }

    }
}

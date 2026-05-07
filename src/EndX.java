public class EndX {
    public String endX(String str){
        if (str.length()==0){
            return "";

        }
        char frist = str.charAt(0);
        String remaining =endX( str.substring(1));
        if (frist=='x'){
            return remaining + "x";

        }
        else {
            return frist+remaining;
        }
    }
}

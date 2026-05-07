public class Count11 {
    public int count11(String str){
        if (str.length()<2){
            return 0;

        }
        String twoChar=str.substring(0,2);
        if (twoChar.equals("11")){
            return 1 + count11(str.substring(2));


        }else{
            return count11(str.substring(1));
        }

    }
}

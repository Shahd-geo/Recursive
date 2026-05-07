public class ParenBit {
    public String parenBit(String str){
        if (str.charAt(0)=='(' && str.charAt(str.length() - 1) == ')') {
            return str;
        }
        if (str.charAt(0)!= '(' ){
            return parenBit(str.substring(1));

        }

    }
}

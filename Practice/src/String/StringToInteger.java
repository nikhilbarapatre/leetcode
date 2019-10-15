package String;

public class StringToInteger {
    public int myAtoI(String str){
        str = str.trim();
        if(str.length() == 0)
            return 0;
        char first = str.charAt(0);
        long result = 0;
        int sign = 1, start = 0;
        if(first == '+'){
            sign = 1;
            start++;
        }
        else if(first == '-'){
            sign = -1;
            start++;
        }
        for(int i = start; i < str.length(); i++){
            if(!Character.isDigit(str.charAt(i)))
                return (int) result * sign;
            result = result * 10 + str.charAt(i) - '0';
            if(sign == 1 && result > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if(sign == -1 && (-1) * result < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;
        }
        return (int) result * sign;
    }

    public static void main(String[] args) {
        StringToInteger str = new StringToInteger();
        System.out.println(str.myAtoI("4193 with words"));
    }
}

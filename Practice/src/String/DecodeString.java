package String;

import java.util.*;

public class DecodeString {
    public String decodeString(String s){
        Stack<Integer> digitStack = new Stack<>();
        Stack<String> resultStack = new Stack<>();
        String result = "";
        int index = 0;
        while(index < s.length()){
            if(Character.isDigit(s.charAt(index))){
                int count = 0;
                while(Character.isDigit(s.charAt(index))){
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                digitStack.push(count);
            }
            else if(s.charAt(index) == '['){
                resultStack.push(result);
                result = "";
                index++;
            }
            else if(s.charAt(index) == ']'){
                StringBuilder temp = new StringBuilder(resultStack.pop());
                int repeat = digitStack.pop();
                for(int i = 0 ; i < repeat; i++)
                    temp.append(result);
                result = temp.toString();
                index++;
            }
            else{
                result += s.charAt(index++);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        DecodeString dec = new DecodeString();
        String result = dec.decodeString("3[a2[c]]");
        System.out.println(result);
    }
}

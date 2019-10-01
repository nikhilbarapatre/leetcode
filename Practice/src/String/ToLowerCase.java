package String;

import java.util.*;

/*
*
* we check if the character is between 'A' and 'Z' and if it is then, we subtract 'A' and add 'a'
* */

public class ToLowerCase {
    public String toLowerCase(String str){
        char[] c = str.toCharArray();
        for(int i = 0; i < c.length; i++){
            if(c[i] >= 'A' && c[i] <= 'Z'){
                c[i] = (char)(c[i] - 'A' + 'a');
            }
        }
        return new String(c);
    }

    public static void main(String[] args) {
        ToLowerCase tl = new ToLowerCase();
        String result = tl.toLowerCase("HHHEELELELElo");
        System.out.println(result);
    }
}

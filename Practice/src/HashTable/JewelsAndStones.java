package HashTable;

import java.util.*;


/*
* We check for all the characters in the word against a single character of the Jewel.
* */

public class JewelsAndStones {
    public int jewelAndStones(String J, String S){
        int count = 0;
        int i = 0;
        while(i < J.length()){
            for(char c : S.toCharArray()){
                if(J.charAt(i) == c)
                    count++;
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
        JewelsAndStones jewel = new JewelsAndStones();
        int result = jewel.jewelAndStones("aA","aAAbbbaaAb");
        System.out.println(result);
    }
}

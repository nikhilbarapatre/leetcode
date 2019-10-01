package HashTable;

import java.util.*;

public class LongestPalindrome {
    public int longestPalindrome(String s){
        int count = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++){
            if(set.contains(s.charAt(i))){
                set.remove(s.charAt(i));
                count++;
            }
            else
                set.add(s.charAt(i));
        }
        if(!set.isEmpty())
            return count * 2 + 1;
        else
            return count * 2;
    }

    public static void main(String[] args) {
        LongestPalindrome l = new LongestPalindrome();
        int result = l.longestPalindrome("abccccdd");
        System.out.println(result);
    }
}

package String;

import java.util.*;

public class LongestSubWORepeating {
    public int lengthOfLongestSubstring(String s){
        int result = 0, i = 0, j = 0;
        Set<Character> set = new HashSet<>();
        while(i < s.length() && j < s.length()){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            }
            else
                set.remove(s.charAt(i++));
        }
        return result;
    }

    public static void main(String[] args) {
        LongestSubWORepeating l = new LongestSubWORepeating();
        int result = l.lengthOfLongestSubstring("pwwkew");
        System.out.println(result);
    }
}

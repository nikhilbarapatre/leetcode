package String;

import java.util.*;

public class FirstUniqueCharacter {
    public int firstUnique(String s){
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        for (int i = 0; i < s.length(); i++) {
            if(map.get(s.charAt(i)) == 1)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        FirstUniqueCharacter first = new FirstUniqueCharacter();
        int result = first.firstUnique("loveleetcode");
        System.out.println(result);
    }
}

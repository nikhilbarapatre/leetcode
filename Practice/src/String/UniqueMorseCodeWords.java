package String;

import java.util.*;

/*
*
* */

public class UniqueMorseCodeWords {
    public int uniqueMorseRepresentations(String[] words){
        String[] MORSE = new String[]{".-","-...","-.-.","-..",".","..-.","--.","....",
                "..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-",
                "...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();
        for(String word : words){
            for(char c : word.toCharArray()){
                sb.append(MORSE[c - 'a']);
            }
            set.add(sb.toString());
            sb = new StringBuilder();
        }
        return set.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords um = new UniqueMorseCodeWords();
        String[] words = {"gin", "zen", "gig", "msg"};
        int result = um.uniqueMorseRepresentations(words);
        System.out.println(result);
    }
}

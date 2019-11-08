package String;

import java.util.*;

public class MostCommonWord {
    public String mostCommonWord(String paragraph, String[] banned){
        paragraph += ".";
        Set<String> bannedSet = new HashSet<>();
        for(String s : banned)
            bannedSet.add(s);
        Map<String, Integer> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        int resFreq = 0;
        String result = "";
        for(char c : paragraph.toCharArray()){
            if(Character.isLetter(c))
                sb.append(Character.toLowerCase(c));
            else if(sb.length() > 0){
                String finalWord = sb.toString();
                if(!bannedSet.contains(finalWord)){
                    map.put(finalWord, map.getOrDefault(finalWord, 0) + 1);
                    if(map.get(finalWord) > resFreq){
                        resFreq = map.get(finalWord);
                        result = finalWord;
                    }
                }
                sb = new StringBuilder();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MostCommonWord common = new MostCommonWord();
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
        System.out.println(common.mostCommonWord(paragraph, banned));
    }
}

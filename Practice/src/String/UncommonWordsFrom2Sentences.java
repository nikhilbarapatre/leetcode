package String;

import java.util.*;

public class UncommonWordsFrom2Sentences {
    public String[] uncommonFromSentences(String A, String B){
        Map<String,Integer> count = new HashMap<>();
        for(String word : A.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        for(String word : B.split(" "))
            count.put(word, count.getOrDefault(word, 0) + 1);
        List<String> result = new ArrayList<>();
        for(String word : count.keySet()){
            if(count.get(word) == 1)
                result.add(word);
        }
        return result.toArray(new String[result.size()]);
    }

    public static void main(String[] args) {
        UncommonWordsFrom2Sentences uncommon = new UncommonWordsFrom2Sentences();
        String[] result = uncommon.uncommonFromSentences("this apple is sweet", "this apple is sour");
        for(String word : result)
            System.out.println(word);
    }
}

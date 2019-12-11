package BFS;

import java.util.*;

public class WordLadder {
    public int ladderLength(String beginWord, String endWord, List<String> wordList){
        Set<String> wordSet = new HashSet<>(wordList);
        if(!wordSet.contains(endWord))
            return 0;
        int ladderLength = 0;
        Queue<String> queue = new LinkedList<>();
        queue.add(beginWord);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0; i < size; i++){
                String currentWord = queue.remove();
                if(currentWord.equals(endWord))
                    return ladderLength + 1;
                for(int j = 0; j < currentWord.length(); j++){
                    char[] current = currentWord.toCharArray();
                    for(char ch = 'a'; ch < 'z'; ch++){
                        current[j] = ch;
                        String checkWord = new String(current);
                        if(!checkWord.equals(currentWord) && wordSet.contains(checkWord)){
                            queue.add(checkWord);
                            wordSet.remove(checkWord);
                        }
                    }
                }
            }
            ladderLength++;
        }
        return 0;
    }

    public static void main(String[] args) {
        WordLadder ladder = new WordLadder();
        List<String> wordList = new ArrayList<>();
        wordList.add("hot");
        wordList.add("dot");
        wordList.add("dog");
        wordList.add("lot");
        wordList.add("log");
        wordList.add("cog");
        System.out.println(ladder.ladderLength("hit", "cog", wordList));
    }
}

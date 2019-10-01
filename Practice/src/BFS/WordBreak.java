package BFS;

import java.util.*;

public class WordBreak {
    public boolean wordBreakBFS(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        Queue<Integer> queue = new LinkedList<>();
        int[] visited = new int[s.length()];
        queue.add(0);
        while(!queue.isEmpty()){
            int start = queue.remove();
            if(visited[start] == 0){
                for(int end = start + 1; end <= s.length(); end++){
                    if(set.contains(s.substring(start, end))){
                        queue.add(end);
                        if(end == s.length())
                            return true;
                    }
                }
                visited[start] = 1;
            }
        }
        return false;
    }

    public boolean wordBreakDP(String s, List<String> wordDict){
        Set<String> set = new HashSet<>(wordDict);
        boolean[] dp = new boolean[s.length() + 1];
        dp[0] = true;
        for(int i = 0; i <= s.length(); i++){
            for(int j = 0; j < i; j++){
                if(dp[j] && set.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }

    public static void main(String[] args) {
        WordBreak wb = new WordBreak();
        List<String> wordDict = new ArrayList<>();
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wb.wordBreakBFS("applepenapple", wordDict));
        System.out.println(wb.wordBreakDP("appleapplepen", wordDict));
    }
}

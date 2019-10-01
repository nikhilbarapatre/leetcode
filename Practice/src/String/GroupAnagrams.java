package String;

import java.util.*;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] str){
        Map<String, List> result = new HashMap<>();
        for(String s : str){
            char[] c = s.toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if(!result.containsKey(key))
                result.put(key, new ArrayList());
            result.get(key).add(s);
        }
        return new ArrayList(result.values());
    }

    public static void main(String[] args) {
        GroupAnagrams group = new GroupAnagrams();
        String[] str = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> result = group.groupAnagrams(str);
        for(List list : result){
            for(int i = 0; i < list.size(); i++)
                System.out.print(list.get(i) + " ");
            System.out.println();
        }
    }
}

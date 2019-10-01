package Backtracking;

import java.util.*;

public class GenerateParanthesis {
    public List<String> generateParanthesis(int n){
        List<String> result = new ArrayList<>();
        Set<String> set = new HashSet<>();
        set = returnSet(n);
        result.addAll(set);
        return result;
    }
    private Set<String> returnSet(int n){
        Set<String> set = new HashSet<>();
        if(n == 0)
            return set;
        if(n == 1)
            set.add("()");
        else{
            set = returnSet(n - 1);
            Set<String> subset = new HashSet<>();
            for(String s : set){
                for(int i = 0; i < s.length(); i++)
                    subset.add(s.substring(0, i) + "()" + s.substring(i));
            }
            set.clear();
            set.addAll(subset);
        }
        return set;
    }

    public static void main(String[] args) {
        GenerateParanthesis gen = new GenerateParanthesis();
        List<String> result = gen.generateParanthesis(3);
        for(String s : result){
            System.out.println(s);
        }
    }
}

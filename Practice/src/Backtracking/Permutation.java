package Backtracking;

import java.util.*;
public class Permutation {
    public List<List<Integer>> permute(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), nums);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> temp, int[] nums){
        if(temp.size() == nums.length)
            result.add(new ArrayList<>(temp));
        else{
            for(int i = 0; i < nums.length; i++){
                if(temp.contains(nums[i]))
                    continue;
                temp.add(nums[i]);
                backtrack(result, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        Permutation per = new Permutation();
        int[] nums = {1, 2, 3};
        List<List<Integer>> result = per.permute(nums);
        for(List l : result){
            for(int i = 0; i < l.size(); i++)
                System.out.print("[" + l.get(i) + "]");
            System.out.println();
        }
    }
}

package Backtracking;

import java.util.*;

public class CombinationSumII {
    public List<List<Integer>> combinatinSum2(int[] candidates, int target){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }
    private void backtrack(List<List<Integer>> result, List<Integer> tempList,
                           int[] candidates, int target, int start){
        if(target < 0)
            return;
        else if(target == 0)
            result.add(new ArrayList<>(tempList));
        else{
            for(int i = start; i < candidates.length; i++){
                if(i > start && candidates[i] == candidates[i - 1])
                    continue;
                tempList.add(candidates[i]);
                backtrack(result, tempList, candidates, target - candidates[i], i + 1);
                tempList.remove(tempList.size() - 1);
            }
        }
    }

    public static void main(String[] args) {
        CombinationSumII com2 = new CombinationSumII();
        int[] candidates = {10,1,2,7,6,1,5};
        List<List<Integer>> result = com2.combinatinSum2(candidates, 8);
        for(List list : result){
            for(int i = 0; i < list.size(); i++){
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}

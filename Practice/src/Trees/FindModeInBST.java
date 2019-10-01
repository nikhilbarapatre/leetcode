package Trees;

import java.util.*;
public class FindModeInBST {
    Map<Integer, Integer> map;
    int max = Integer.MIN_VALUE;
    public int[] findMode(TreeNode root){
        List<Integer> list = new ArrayList<>();
        if(root == null)
            return new int[0];
        traverse(root);
        for(int i : map.keySet()){
            if(map.get(i) == max)
                list.add(i);
        }
        int[] result = new int[list.size()];
        for(int i = 0; i < list.size(); i++)
            result[i] = list.get(i);
        return result;
    }
    private void traverse(TreeNode root){
        if(root.left != null)
            traverse(root.left);
        map.put(root.val, map.getOrDefault(root.val, 0) + 1);
        max = Math.max(max, map.get(root.val));
        if(root.right != null)
            traverse(root.right);
    }
}

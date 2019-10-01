package Trees;

import java.util.*;

public class IncreasingOrderSearchTree {
    public TreeNode increasingBST(TreeNode root){
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        TreeNode result = new TreeNode(0), curr = result;
        for(int val : list){
            curr.right = new TreeNode(val);
            curr = curr.right;
        }
        return result.right;
    }

    private void inorder(TreeNode root, List<Integer> list){
        if(root != null){
            inorder(root.left, list);
            list.add(root.val);
            inorder(root.right,list);
        }
    }
}

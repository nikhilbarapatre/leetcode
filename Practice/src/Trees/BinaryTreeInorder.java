package Trees;

import java.util.*;

public class BinaryTreeInorder {

    //Recursive
    public List<Integer> bTreeInorder(TreeNode root){
        List<Integer> result = new ArrayList<>();
        helper(root, result);
        return result;
    }

    private void helper(TreeNode root, List<Integer> result){
        if(root != null){
            if(root.left != null){
                helper(root.left, result);
            }
            result.add(root.val);
            if(root.right != null){
                helper(root.right, result);
            }
        }
    }

    //Non-recursive
    public List<Integer> bTreeInorderNonRecursive(TreeNode root){
        List<Integer> result = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode curr = root;
        while(curr != null || !stack.isEmpty()){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            result.add(curr.val);
            curr = curr.right;
        }
        return result;
    }

    //Iterative Alternative

//    public List<Integer> bTreeInorederItr(TreeNode root){
//        List<Integer> result = new ArrayList<>();
//
//    }
}

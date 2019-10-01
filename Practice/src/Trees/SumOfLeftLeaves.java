package Trees;

import java.util.Stack;

public class SumOfLeftLeaves {
    public int sumOfLeftLeaves(TreeNode root){
        int sum = 0;
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            if(node != null){
                if(node.left != null && node.left.left == null && node.left.right == null)
                    sum += node.left.val;
                stack.push(node.left);
                stack.push(node.right);
            }
        }
        return sum;
    }
}

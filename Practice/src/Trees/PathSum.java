package Trees;

import java.util.Stack;

public class PathSum {
    public boolean hasPathSumRec(TreeNode root, int sum){
        if(root != null){
            if(root.left == null && root.right == null)
                return root.val == sum;
            return hasPathSumRec(root.left, sum - root.val) || hasPathSumRec(root.right, sum - root.val);
        }
        return false;
    }

    public boolean hasPathSumItr(TreeNode root, int sum){
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        while(!stack.isEmpty() && root != null){
            TreeNode curr = stack.pop();
            if(root.left == null && root.right == null)
                if(curr.val == sum)
                    return true;
            if(curr.left != null){
                curr.left.val += curr.val;
                stack.push(curr.left);
            }
            if(curr.right != null){
                curr.right.val += curr.val;
                stack.push(curr.right);
            }
        }
        return false;
    }
}

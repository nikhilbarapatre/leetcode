package Trees;

import java.util.ArrayList;
import java.util.List;

public class UnivaluedBinaryTree {
    List<Integer> list = new ArrayList<>();
    public boolean isUnivalTree(TreeNode root){
        dfs(root);
        for(int n : list){
            if(n != list.get(0))
                return false;
        }
        return true;
    }

    private void dfs(TreeNode root){
        if(root != null){
            list.add(root.val);
            dfs(root.left);
            dfs(root.right);
        }
    }
}
